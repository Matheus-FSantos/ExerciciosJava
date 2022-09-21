/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
/**
 *
 * @author mfm65
 */
public class Exercicio14 {
    public static void main(String[] args) {
        int colunas = 3;
        int linhas = 3;
        char matriz[][] = new char [colunas][linhas];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = '-';
            }
        }
        
        System.out.println("\n      MATRIZ:      ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j]+ "\t");
            }
            System.out.println();
        }
    }    
}
