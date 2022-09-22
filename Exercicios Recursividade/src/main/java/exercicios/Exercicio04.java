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
public class Exercicio04 {
    
    static int funcaoRecursiva(int numero){
        if(numero == 1){
            return 1;
        } else {
            return numero + funcaoRecursiva(numero - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Informe um numero: ");
        int numero = new Scanner(System.in).nextInt();
        
        int resultado = funcaoRecursiva(numero);
        System.out.println("O resultado da somatoria dos numeros de  1 até " + numero + " é igual ha: " + resultado);
    }
}
