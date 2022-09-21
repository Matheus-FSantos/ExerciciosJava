/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author mfm65
 */
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int colunas = 3;
        int linhas = 3;
        int setColunas = 0;
        int setLinhas = 0;
        
        int numeroTroca = 0;
        
        int matriz[][] = new int [linhas][colunas];
           
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15+2);
            }
        }
        
        System.out.println("\n      MATRIZ PADRAO");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nInforme a linha do numero que deseja mudar:");
        setLinhas = leitor.nextInt();
        
        System.out.println("\nInforme em qual coluna da " + setLinhas + "ª linha que o numero se encontra:");
        setColunas = leitor.nextInt();
        
        
        System.out.println("\nInforme o numero que deseja substituir:");
        numeroTroca = leitor.nextInt();
        
        matriz[setLinhas - 1][setColunas - 1] = numeroTroca;
        
        System.out.println("\n      MATRIZ ALTERADA");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }  
    }
}