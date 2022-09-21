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
public class Exercicio30 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe o numero de linha que quer que tenha sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe o numero de colunas que quer que tenha sua matriz: ");
        colunas = leitor.nextInt();
        
        int vetorA [] = new int [colunas];
        int matriz [][] = new int [linhas][colunas];
        
        //leitura vetorA
        for (int c = 0; c < vetorA.length; c = c + 1){
            System.out.println("Informe o " + (c + 1) + "º numero do vetor: ");
            vetorA [c] = leitor.nextInt();
        }
        
        //atribuicao para a matriz
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                matriz[l][c] = vetorA [c];
            }
        }
        
        System.out.println("\nMatriz com os numeros copiados do Vetor: ");
        //impressao
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.print(matriz [l][c] + "\t");
            }
            System.out.println();
        }
    }
}
