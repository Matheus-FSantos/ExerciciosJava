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
public class Exercicio19 {
    static int pell(int numero){
        if(numero == 0 || numero == 1){
            return numero;
        } else {
            return 2*pell(numero - 1) + pell(numero - 2);
        }
    }
    public static void main(String[] args) {
        System.out.print("Informe um numero: ");
        int numero = new Scanner(System.in).nextInt();
        
        int resultado = pell(numero);
        System.out.println("P(" + numero + ") = " + resultado);
        
        System.out.println("\nPell");
        for(int i = 0; i <= numero; i++){
            System.out.printf(pell(i) + "\t");
        }
    }
}