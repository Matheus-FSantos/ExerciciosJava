/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio20 {
    public static void main(String[] args) {
        int colunas = 3;
        int linhas = 3;
        
        int matriz[][] = new int [linhas][colunas];
        int clone [][] = new int [linhas][colunas];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15+2);
                clone [i][j] = matriz[i][j];
            }
        }
        
        System.out.println("\n  Matriz Padrão");    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("\n  Matriz Clonada");    
        for (int i = 0; i < clone.length; i++) {
            for (int j = 0; j < clone[i].length; j++){
                System.out.printf(clone[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
