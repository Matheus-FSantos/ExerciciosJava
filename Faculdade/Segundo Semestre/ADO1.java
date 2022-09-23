/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author matheus.fsantos52
 */
public class ADO1 {
    
    static Scanner leitor = new Scanner(System.in);
    
    static int [][]funcaoMatriz(int matriz[][], int linhas, int colunas){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Informe o numero: ");
                matriz[i][j] = leitor.nextInt();
            }
        }
        return matriz;
    }
    
    static int funcaoSomaColuna(int somaC, int linhas, int colunas, int matriz[][]){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaC = somaC + matriz[i][j];
            }
            break; 
            /*
                só soma a primeira parte do laco for,
                e quebra o programa fazendo somar so a 
                primeira coluna, igualmente acontecerá
                na funcao de somar linha
            */
        }
        return somaC;
    }
    
    
    static int funcaoSomaLinha(int somaL, int linhas, int colunas, int matriz[][]){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaL = somaL + matriz[j][i];
            }
            break;
        }
        return somaL;
    }
    
    static int funcaoDiagonalPrincipal(int somaDP, int matriz[][], int linhas, int colunas){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    somaDP = somaDP + matriz[i][j];
                }
            }
        }
        return somaDP;
    }
    
    static int funcaoDiagonalSecundaria (int somaDS, int matriz[][], int linhas, int colunas){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if ((i + j) == (matriz.length - 1)){
                    somaDS = somaDS + matriz[i][j];
                }
            }
        }
        return somaDS;
    }
    
    static boolean funcaoTeste(boolean teste, int somaL, int somaC, int somaDS, int somaDP){
        if (somaC == somaL){
            if (somaDS == somaDP){
                teste = true;
            }
        }
        return teste;
    }
    
    static void impressao(boolean teste){
        if (teste == false){
            System.out.println("\nA matriz não é quadrado magico");
        } else
            System.out.println("\nA matriz é um quadrado magico");
    }
    
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        
        int somaL = 0;
        int somaC = 0;
        int somaDP = 0;
        int somaDS = 0;
        boolean teste = false;
        
        int matriz[][] = new int [linhas][colunas];
        
        //Retornar as funções
        matriz = funcaoMatriz(matriz, linhas, colunas);
        somaC = funcaoSomaColuna(somaC, linhas, colunas, matriz);
        somaL = funcaoSomaLinha(somaL, linhas, colunas, matriz);
        somaDP = funcaoDiagonalPrincipal(somaDP, matriz, linhas, colunas);
        somaDS = funcaoDiagonalSecundaria(somaDS, matriz, linhas, colunas);
        teste = funcaoTeste(teste, somaL, somaC, somaDS, somaDP);
        impressao(teste);
    }
}
