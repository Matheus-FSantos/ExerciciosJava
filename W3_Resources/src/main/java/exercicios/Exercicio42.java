/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2.lista04;
import java.util.Scanner;
/**
 *
 * @author mfm65
 */
public class Exercicio42 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int aux = 0;
        int aux2 = 0;
        int produto = 0;
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        int matriz2 [][] = new int [linhas][colunas];
        
        System.out.println("\n----MATRIZ 1: ----");
        //laco para inseção dos valores
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        System.out.println("\n----MATRIZ 2: ----");
        for (int l = 0; l < matriz2.length; l = l + 1){
            for (int c = 0; c < matriz2[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz2 [l][c] = leitor.nextInt();
            }
        }
        
        //laco para verificacao do maior numero da matriz
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (matriz [l][c] > aux) {
                    aux = matriz[l][c];
                }
            }
        }
        
        //laco para verificacao do maior numero da matriz2
        for (int l = 0; l < matriz2.length; l = l + 1){
            for (int c = 0; c < matriz2[l].length; c = c + 1){
                if (matriz2 [l][c] > aux2) {
                    aux2 = matriz2[l][c];
                }
            }
        }
        
        produto = aux * aux2;
        
        
        System.out.println("\nO maior numero da matriz 1 é: " + aux);
        System.out.println("O maior numero da matriz 2 é: " + aux2);
        System.out.println("\nO produto dos maiores numeros das 2 matrizes é: " + produto);
    }
}