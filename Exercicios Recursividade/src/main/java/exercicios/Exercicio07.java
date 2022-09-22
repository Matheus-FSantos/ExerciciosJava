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
public class Exercicio07 {
    
    static void funcaoRecursiva(int numero, int quant){
        if (numero == quant){
            System.out.printf(quant + "\t");
        } else if(quant %2 == 0){
            System.out.printf(quant + "\t");
            funcaoRecursiva(numero, quant + 1);
        } else{
            funcaoRecursiva(numero, quant + 1);
        }
    }
    
    public static void main(String[] args) {
        int numero = 0;
        int quant = 0;
        
        System.out.print("Informe um numero: ");
        numero = new Scanner(System.in).nextInt();
        while(numero %2 == 1){
            System.out.print("Informe um numero par: ");
            numero = new Scanner(System.in).nextInt();
        }
        
        funcaoRecursiva(numero, quant);
    }
}
