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
public class Exercicio18 {
    static int padovan(int numero){
        if(numero == 0 || numero == 1 || numero == 2){
            return 1;
        } else {
            return padovan(numero - 2) + padovan(numero - 3);
        }
    }
    public static void main(String[] args) {
        System.out.print("Informe um numero: ");
        int numero = new Scanner(System.in).nextInt();
        
        int resultado = padovan(numero);
        System.out.println("P(" + numero + ") = " + resultado);
        
        System.out.println("\nPadovan");
        for(int i = 0; i <= numero; i++){
            System.out.printf(padovan(i) + "\t");
        }
    }
}