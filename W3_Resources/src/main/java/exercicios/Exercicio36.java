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
public class Exercicio36 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //laco para inseção dos valores
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        System.out.println("\nNumeros da Diagonal Principal: ");
        
        //laco para impressao
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (c == l){ //teste para ver se é diagonal principal
                    System.out.println("-> " + matriz[l][c]);
                }
            }
        }
    }
}