/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio09 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][3];
        int matriz2[][] = new int [3][3];
        
        //Abastecendo a matriz com numeros aleatorios
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                matriz[l][c] = (int) (Math.random()*60);
            }
        }
        
        for (int l = 0; l < matriz2.length; l++){
            for (int c = 0; c < matriz2[l].length; c++){
                matriz2[l][c] = matriz[l][c] * 2;
            }
        }
        
        System.out.println("\n----Matriz Normal----");    
        for (int l = 0; l < matriz.length; l++){
            for (int c = 0; c < matriz[l].length; c++){
                System.out.printf(matriz[l][c] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n----Matriz MOD----");
        for (int l = 0; l < matriz2.length; l++){
            for (int c = 0; c < matriz2[l].length; c++){
                System.out.printf(matriz2[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
