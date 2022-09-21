/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2.lista04;
import java.util.Scanner;
/**
 *
 * @author mfm65
 */
public class Exercicio27 {
    
    static int [][] matrizFuncao (int linhas, int colunas, int matriz [][]){
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                matriz [l][c] = l + c;
            }
        }
        return matriz;
    }
    
    static void impressao (int linhas, int colunas, int matriz [] []){
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.print(matriz [l][c] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que deseja que tenha em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja que tenha em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //atribuicao
        matriz = matrizFuncao (linhas, colunas, matriz);
        
        System.out.println("\nMatriz: ");
        
        //impressao
        impressao (linhas, colunas, matriz);
    }
}