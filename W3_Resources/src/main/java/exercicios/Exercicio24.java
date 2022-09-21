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
public class Exercicio24 {
    public static void main(String[] args) {
        //var:
        int linhas = 0;
        int colunas = 0;
        Scanner leitor = new Scanner (System.in);
        System.out.println("Informe a quantidade de linhas que quer em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que quer em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //atribuicao e teste
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (c == 0){
                    matriz [l][c] = 4;
                } else 
                    if (c == 1){
                        matriz [l][c] = 7;
                    } else
                        if (c % 2 == 0) {
                            matriz [l][c] = 4;
                        } else 
                            if (c % 2 == 1){
                                matriz [l][c] = 7;
                            }
            }
        }
        
        System.out.println("\nMatriz: ");
        
        //impressao
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.print(matriz [l][c] + "\t");
            }
            System.out.println();
        }
    }
}
