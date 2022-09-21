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
public class Exercicio39 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        int mult1 = 1;
        int mult2 = 1;
        int resultado = 0;
        
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        int matriz2 [][] = new int [linhas][colunas];
        
        //leitura da matriz
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha");
                matriz [l][c] = leitor.nextInt();
                mult1 = mult1 * matriz [l][c];
            }
        }
        
        //leitura da matriz2
        for (int l = 0; l < matriz2.length; l = l + 1){
            for (int c = 0; c < matriz2[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha");
                matriz2 [l][c] = leitor.nextInt();
                mult2 = mult2 * matriz2 [l][c];
            }
        }
        
        //resultado dos 2 produtos
        resultado = mult1 * mult2;
        
        System.out.println("\nO produto das 2 matrizes é: " + resultado);
    }
}