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
public class Exercicio40 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int numero = 0;
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que sua matriz tera: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que sua matriz tera: ");
        colunas = leitor.nextInt();
        System.out.println("Informe o numero que ira servir como parametro: ");
        numero = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //leitura da matriz
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        System.out.println("\nO numero informado para parametro se encontra na: ");
        //impressao
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (matriz [l][c] == numero){ //teste para verificar se o numero parametro é igual ao numero da matriz
                    System.out.println((l + 1) + "ª linha e na " + (c + 1) + "ª coluna");
                }
            }
        }
    }
}