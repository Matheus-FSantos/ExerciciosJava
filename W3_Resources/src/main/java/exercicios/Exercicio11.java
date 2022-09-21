/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio11 {
    public static void main(String[] args) {
        int k = 3;
        int l = 2;
        
        int matriz[][] = new int [k][l];
        int maior = 0;
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15);
            }
        }
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j == 0 && i == 0){
                    maior = matriz[i][j];
                } else {
                    if (maior < matriz[i][j]){
                        maior = matriz[i][j];
                    }
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
        
        System.out.println("\nO maior numero da matriz é: " + maior);
    }
}