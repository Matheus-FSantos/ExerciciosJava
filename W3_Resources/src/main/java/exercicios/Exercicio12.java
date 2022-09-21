/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio12 {
    public static void main(String[] args) {
        int c = (int)(Math.random()*6 - 1);
        int l = (int)(Math.random()*6 - 1);
        int soma = 0;
        
        int matriz[][] = new int [c][l];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15);
            }
        }
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        
        System.out.println("\n----MATRIZ----");        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\nO traço da matriz é: " + soma);
    }
}
