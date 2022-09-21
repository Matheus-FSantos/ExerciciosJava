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
public class Exercicio32 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int soma = 0;
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que sua matriz tera: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que sua matriz tera: ");
        colunas = leitor.nextInt();
        
        int vetorA [] = new int [linhas];
        int matriz [][] = new int [linhas][colunas];
        
        //leitura da matriz
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        //soma dos numeros que estao em um indice impar
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (c == 1){
                    soma = soma + matriz [l][c];
                } else 
                    if (c % 2 == 1){
                        soma = soma + matriz[l][c];
                    }
            }
            vetorA [l] = soma; //atribuicao da soma a um vetor
            soma = 0;
        }
        
        System.out.println("\nSoma dos numeros impares: ");
        //impressao da soma utilizando um vetor
        for (int l = 0; l < vetorA.length; l = l + 1){
            System.out.println("-> " + vetorA [l]);
        }
    }    
}