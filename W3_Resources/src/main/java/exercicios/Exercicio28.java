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
public class Exercicio28 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        int soma = 0;
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        int vetorSoma [] = new int [linhas];
        
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha da matriz: ");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                soma = soma + matriz [c][l];
            }
            vetorSoma [l] = soma; //vetor para guardar a soma dos valores da linha
            soma = 0; //prevenção de bugs
        }
        
        System.out.println("\nA soma dos valores de cada linha é: ");
        //saida do vetor
        for (int l = 0; l < vetorSoma.length; l = l + 1){
            System.out.println((l + 1) + "ª linha: " + vetorSoma [l]);
        }
    }    
}
