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
public class Exercicio08 {
    
    static void funcaoRecursiva(int numero){
        if(numero == 0){
            System.out.print(0);
        } else if(numero %2 == 1){
            funcaoRecursiva(numero - 1);
        } else {
            System.out.printf(numero + "\t");
            funcaoRecursiva(numero - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 0;
        
        System.out.print("Informe um numero: ");
        numero = new Scanner(System.in).nextInt();
        while(numero %2 == 1){
            System.out.print("Informe um numero par: ");
            numero = new Scanner(System.in).nextInt();
        }
        
        funcaoRecursiva(numero);
    }
}
