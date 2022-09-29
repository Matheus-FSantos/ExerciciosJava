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
public class Exercicio21 {
    static int tribonacci(int numero){
        if(numero == 0 || numero == 1){
            return 0;
        } else if(numero == 2){
            return 1;
        }else{
            return tribonacci(numero - 1) + tribonacci(numero - 2) + tribonacci(numero - 3);
        }
    }
    public static void main(String[] args) {
        System.out.print("Informe um numero para verificar sua Tribonacci: ");
        int numero = new Scanner(System.in).nextInt();
        
        int resultado = tribonacci(numero);
        System.out.println("F(" + numero + ") = " + resultado);
        
        System.out.println("Tribonacci");
        for(int i = 0; i <= numero; i++){
            System.out.print(tribonacci(i) + "\t");
        }
    }
}