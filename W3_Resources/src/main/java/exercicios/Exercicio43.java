/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio43 {
    public static void main(String[] args) {
        int maior = 0;
        int menor = 0;
        
        int linhas = 3;
        int colunas = 3;
        
        int matriz[][] = new int [linhas][colunas];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15+2);
            }
        }
        
        System.out.println("\n   MATRIZ PADRAO");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        maior = matriz[0][0];
        menor = matriz[0][0];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                //Testa os maiores numeros
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
                
                //Testa os menores numeros
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        
        System.out.println("\nO menor numero da matriz é: " + menor + "\nE o maior é: " + maior);
    }
}
