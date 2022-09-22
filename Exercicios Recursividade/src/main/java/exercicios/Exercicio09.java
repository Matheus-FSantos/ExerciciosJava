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
public class Exercicio09 {
    
    static int funcaoRecursiva(int multiplicando, int multiplicador){
        if(multiplicador == 1){
            return multiplicando;
        } else {
            return multiplicando + funcaoRecursiva(multiplicando, multiplicador - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.print("Informe o multiplicando: ");
        int multiplicando = new Scanner(System.in).nextInt();
    
        System.out.print("Informe o multiplicador: ");
        int multiplicador = new Scanner(System.in).nextInt();
        
        int resultado = funcaoRecursiva(multiplicando, multiplicador);
        System.out.println("O resultado de " + multiplicando + " x " + multiplicador + " = " + resultado);
    }
}
