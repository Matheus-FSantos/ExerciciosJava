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
public class Exercicio26 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        System.out.println("Informe o numero de linhas que deseja que sua matriz tenha: ");
        linhas = leitor.nextInt();
        System.out.println("Informe o numero de colunas que deseja que sua matriz tenha: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas];
        
        //atribuicao
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                matriz [l][c] = c;
            }
        }
        
        //impressao
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz.length; c = c + 1){
                System.out.print(matriz [l][c] + "\t");
            }
            System.out.println();
        }
    }
}
