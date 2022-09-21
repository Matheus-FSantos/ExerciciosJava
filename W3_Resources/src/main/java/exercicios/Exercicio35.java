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
public class Exercicio35 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0; 
        int colunas = 0;
        int positivos = 0;
        int soma = 0;
        int media = 0;
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //leitor da matriz
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0 ; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz [l][c] = leitor.nextInt();
                if (matriz [l][c] > 0){ //teste para ver se o numero e positivo
                    positivos = positivos + 1; //acumulador para ver a quant d/positivos
                    soma = soma + matriz [l][c]; //soma dos numeros positivos
                }
            }
        }
        
        //media
        media = soma /positivos;
        
        System.out.println("\nA media dos numeros positivos da matriz é: " + media);
    }
}
