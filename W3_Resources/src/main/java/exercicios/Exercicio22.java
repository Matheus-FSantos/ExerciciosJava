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
public class Exercicio22 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int l = 0;
        int c = 0;
        System.out.println("Informe a quantidade de linhas que deve ter a matriz: ");
        l = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deve ter a matriz: ");
        c = leitor.nextInt();
        
        int matriz [] [] = new int [l] [c];
        
        for (int linha = 0; linha < matriz.length; linha = linha + 1){
            for (int coluna = 0; coluna < matriz[linha].length; coluna = coluna + 1){
                matriz [linha] [coluna] = 20;
            }
        }
        
        System.out.println("\nMatriz so com numeros 20: ");
        
        for (int linha = 0; linha < matriz.length; linha = linha + 1){
            for (int coluna = 0; coluna < matriz[linha].length; coluna = coluna + 1){
                System.out.print(matriz [linha] [coluna] + "\t");
            }
            System.out.println();
        }
    }
}
