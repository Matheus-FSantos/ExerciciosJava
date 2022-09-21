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
public class Exercicio29 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que deseja que sua matriz tenha: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja que sua matriz tenha: ");
        colunas = leitor.nextInt();
        
        int vetorA [] = new int [linhas];
        int matriz [][] = new int [linhas][colunas];
        
        //leitura do vetor
        for  (int l = 0; l < vetorA.length; l = l + 1){
            System.out.println("Informe o " + (l + 1) + "º numero do vetor: ");
            vetorA [l] = leitor.nextInt();
        }
        
        //passando o vetor para a matriz;
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                matriz [l][c] = vetorA [l];
            }
        }
        
        System.out.println("\nMatriz com os elementos do vetor: ");
        //impressao da matriz;
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.print(matriz [l][c] + "\t");
            }
            System.out.println();
        }
    }
}
