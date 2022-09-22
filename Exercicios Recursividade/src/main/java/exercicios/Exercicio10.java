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
public class Exercicio10 {
    
    static void valores(int min, int max, int incremento, int parametro){
        if(min < max){
            if(min == parametro){
                min = min + incremento;
            }
            System.out.print(min + "\t");
            valores(min + incremento, max, incremento, parametro);
        }
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int min = 0;
        int max = 0;
        
        int parametro = 0;
        
        
        int incremento = 0;
        
        System.out.print("Informe um numero base: ");
        min = leitor.nextInt();
        
        System.out.print("Informe um numero maximo: ");
        max = leitor.nextInt();
        
        System.out.print("Informe o incremento: ");
        incremento = leitor.nextInt();
        
        parametro = min;
        valores(min, max, incremento, parametro);
    }
}
