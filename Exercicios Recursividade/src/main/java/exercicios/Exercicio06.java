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
public class Exercicio06 {
    
    static void funcaoRecursiva(int numero){
        if(numero > 0){
            System.out.printf(numero + "\t");
            funcaoRecursiva(numero - 1);
        } else {
            System.out.println(0);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Informe um numero: ");
        int numero = new Scanner(System.in).nextInt();
    
        System.out.println();
        funcaoRecursiva(numero);
    }
}
