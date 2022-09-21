/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author mfm65
 */
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int numeroParametro = 0;
        int colunas = 3;
        int linhas = 3;
        boolean teste = false;
        int matriz [][] = new int [colunas][linhas];
        
        System.out.println("Informe o numero para verificar na matriz:");
        numeroParametro = leitor.nextInt();
    
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random()*15+2);
            }
        }
        
        System.out.println("\n      MATRIZ      ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (numeroParametro == matriz[i][j]){
                   teste = true;
                }
            }
        }
        
        if (teste == true) {
            System.out.println("\nO número está presente na matriz");
        } else
            System.out.println("\nO numero não está presente na matriz");
    }
}
