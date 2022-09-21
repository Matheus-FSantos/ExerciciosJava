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
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int numeroParametro = 0;
        int colunas = 3;
        int linhas = 3;
        
        int matriz[][] = new int [colunas][linhas];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15+2);
            }
        }
        
        System.out.println("\n   MATRIZ ANTIGA   ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nInforme o numero que deseja remover da matriz:");
        numeroParametro = leitor.nextInt();
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (numeroParametro == matriz[i][j]){
                    matriz[i][j] = 0;
                }
            }
        }
        
        System.out.println("\n   NOVA MATRIZ   ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}