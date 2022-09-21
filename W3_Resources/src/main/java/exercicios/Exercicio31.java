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
public class Exercicio31 {
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
        
        int vetorSoma [] = new int [linhas];
        int matriz [][] = new int [linhas][colunas];
        
        //leitura matriz e soma das colunas;
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz.length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1 ) + "ª coluna");
                matriz [l][c] = leitor.nextInt();
                soma = soma + matriz [l][c];
            }
            vetorSoma [l] = soma; //vetor para guardar a soma das colunas;
            soma = 0; //precaução de futuros bugs
        }
        
        System.out.println("\nSoma das colunas da matriz: ");
        
        //impressao
        for (int l = 0; l < matriz.length; l = l + 1){
            System.out.println("-> " + vetorSoma [l]);
        }
    }
}
