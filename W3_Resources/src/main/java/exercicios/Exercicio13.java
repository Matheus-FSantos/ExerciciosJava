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
public class Exercicio13 {
    public static void main(String[] args) {
        int soma = 0;
        int colunas = 20;
        int linhas = 10;
        
        int matriz[][] = new int [colunas][linhas];
        int vetorSoma[] = new int [linhas];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                //Gera numeros aleatorios pra matriz
                matriz[i][j] = (int) (Math.random()*50-1);
            }
        }
        
        System.out.println("Concluido 1");
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma = soma + matriz[i][j];
            }
            vetorSoma[i] = soma;
            soma = 0;
        }
        
        System.out.println("Concluido 2");
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = matriz[i][j] * vetorSoma[i];
            }
        }
        
        System.out.println("Concluido 3");
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
