/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio16 {
    public static void main(String[] args) {
        int soma = 0;
        int colunas = 3;
        int linhas = 3;
        int media = 0;
        
        int matriz[][] = new int [colunas][linhas];
        
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15+2);
                soma = soma + matriz[i][j];
            }
        }
        
        System.out.println("\n      MATRIZ      ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        media = soma /(linhas*colunas);
        
        System.out.println("\nA media da matriz é igual há: " + media);
    }
}
