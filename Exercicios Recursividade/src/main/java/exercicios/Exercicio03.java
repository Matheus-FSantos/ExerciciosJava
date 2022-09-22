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
public class Exercicio03 {
    
    static int funcaoRecursiva(int base, int expoente){
        if(expoente == 1){
            return base;
        } else{
            return base * funcaoRecursiva(base, expoente - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int base = 0;
        int expoente = 0;
        
        System.out.print("Informe o numero de base: ");
        base = leitor.nextInt();
        
        System.out.print("Informe o expoente: ");
        expoente = leitor.nextInt();
        
        int potencia = funcaoRecursiva(base, expoente);
        System.out.println("O resultado de " + base + "^" + expoente + " = " + potencia);
    }
}