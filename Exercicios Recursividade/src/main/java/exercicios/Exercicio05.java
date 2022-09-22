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
public class Exercicio05 {
    
    static void funcaoRecursiva(int numero, int quant){
        if(quant < numero){
            System.out.printf(quant + "\t");
            funcaoRecursiva(numero, quant + 1);
        } else {
            System.out.print(numero);
        }
    }
    public static void main(String[] args) {
        int quant = 0;
        int numero = 0;
        
        System.out.print("Informe um numero: ");
        numero = new Scanner(System.in).nextInt();
        
        System.out.println();
        funcaoRecursiva(numero, quant);
    }
}
