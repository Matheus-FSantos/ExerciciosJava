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
public class Exercicio37 {
    public static void main(String[] args) {
        //var:
        Scanner leitor = new Scanner (System.in);
        int linhas = 0;
        int colunas = 0;
        
        //vars para teste:
        int colunasNum = 0;
        int totalColunas = 0;
        int linhasNum = 0;
        int totalLinhas = 0;
        
        //inserção dos valores
        System.out.println("Informe a quantidade de linhas que deseja ter em sua matriz: ");
        linhas = leitor.nextInt();
        System.out.println("Informe a quantidade de colunas que deseja ter em sua matriz: ");
        colunas = leitor.nextInt();
        
        int matriz [][] = new int [linhas][colunas]; 
        
        //laco para inseção dos valores
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.println("Informe o " + (c + 1) + "º numero da " + (l + 1) + "ª linha: ");
                matriz [l][c] = leitor.nextInt();
            }
        }
        
        //impressao para comparação
        System.out.println("A MATRIZ que você informou é: ");
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
        
        //laco para verificacao de colunas;
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (matriz[c][l] == 0){
                    colunasNum = colunasNum + 1;
                    if (colunasNum == colunas){
                        totalColunas = totalColunas + 1;
                        colunasNum = 0; //evitar bugs
                    }
                }
            }
            colunasNum = 0;
        }
        
        //laco para verificacao de linhas
        for (int l = 0; l < matriz.length; l = l + 1){
            for (int c = 0; c < matriz[l].length; c = c + 1){
                if (matriz[l][c] == 0){
                    linhasNum = linhasNum + 1;
                    if (linhasNum == linhas){
                        totalLinhas = totalLinhas + 1;
                        linhasNum = 0;
                    }
                }
            }
            linhasNum = 0; //para evitar bugs
        }
        
        System.out.println("O numero de linhas nulas é igual à: " + totalLinhas);
        System.out.println("O numero de colunas nulas é igual à: " + totalColunas);
        
    }
}