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
public class Exercicio38 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz \n(OBS): A quantidade de linhas será a quantidade de colunas");
        linhas = leitor.nextInt();
        colunas = linhas;
        
        int matriz [][] = new int [linhas][colunas];
        
        //laco para inseção dos valores
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        System.out.println("\nO(s) Numero(s) da Diagonal Principal da parte superior da matriz é(são): ");
        
        //laco para impressao
        if (linhas % 2 == 1){
            for (int l = 0; l < (matriz.length - 1) /2; l = l + 1){
                for (int c = 0; c < (matriz[l].length - 1) /2; c = c + 1){
                    if (l == c){
                        System.out.println(matriz[l][c]);
                    }
                }
            }
        } else 
            if (linhas % 2 == 0){
                for (int l = 0; l < (matriz.length /2); l = l + 1){
                    for (int c = 0; c < (matriz[l].length /2); c = c + 1){
                        if (l == c){
                            System.out.println(matriz[l][c]);
                        }
                    }
                }
            } 
    }
}