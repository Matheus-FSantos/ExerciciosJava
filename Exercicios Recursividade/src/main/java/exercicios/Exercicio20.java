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
public class Exercicio20 {
    static int catalan(int numero){
        if(numero == 0){
            return 1;
        } else {
            return (2*((2*numero)-1) / (numero+1)) * catalan(numero - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Informe um numero para verificar seu Catalan: ");
        int numero = new Scanner(System.in).nextInt();
        
        int resultado = catalan(numero);
        System.out.println("C(" + numero + ") = " + resultado);
        
        System.out.println("\nCatalan");
        for(int i = 0; i <= numero; i++){
            System.out.printf(catalan(i) + "\t");
        }
    }
}