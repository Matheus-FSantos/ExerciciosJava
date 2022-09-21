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
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int k = 3;
        int l = 2;
        int matriz[][] = new int [k][l];
        int matrizT[][] = new int [l][k];
        
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.println("Informe o " + (i + 1) + "º numero da " + (j + 1) + "ª coluna");
                matriz[i][j] = leitor.nextInt();
            }
        }
        
        for (int i = 0; i < matrizT.length; i++){
            for (int j = 0; j < matrizT[i].length; j++){
                matrizT[i][j] = matriz[j][i];
            }
        }
        
        for (int i = 0; i < matrizT.length; i++){
            for (int j = 0; j < matrizT[0].length; j++){
                System.out.printf(matrizT[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
