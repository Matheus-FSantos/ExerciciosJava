/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author matheus.fsantos52
 */
public class Exercicio17 {
    static int tetranacci(int numero){
        if(numero == 0 || numero == 1 || numero == 2){
            return 0;
        } else if(numero == 3){
            return 1;
        } else {
            return tetranacci(numero - 1) + tetranacci(numero - 2) + tetranacci(numero - 3) + tetranacci(numero - 4);
        }
    }
    public static void main(String[] args) {
        System.out.print("Informe um numero para verificar o tetranacci: ");
        int numero = new Scanner(System.in).nextInt();
        
        int resultado = tetranacci(numero);
        System.out.println("T(" + numero + ") = " + resultado);
        
        System.out.println("Tetranacci");
        for(int i = 0; i <= numero; i++){
            System.out.printf(tetranacci(i) + "\t");
        }
    }
}