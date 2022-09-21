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
public class Exercicio33 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner(System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //leitura matriz:
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz[l][c] = leitor.nextInt();
            }
        }
        
        //impressao dos numeros negativos da matriz informada > SE TIVER <
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (matriz [l][c] < 0){
                    System.out.println("O numero " + matriz[l][c] + " está na linha: " + (l + 1) + " e na coluna: " + (c + 1));
                }
            }
        }
    }
}