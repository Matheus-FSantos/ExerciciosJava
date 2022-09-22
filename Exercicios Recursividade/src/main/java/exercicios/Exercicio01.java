/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
/**
 *
 * @author mfm65
 */
public class Exercicio01 {
    static int []inseriNumeros(int vetor[], int quant){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*100+1);
        }
        return vetor;
    }
    
    static void imprimir(int vetor[]){
        for(int elemento : vetor){
            System.out.printf(elemento + "\t");
        }
        
        System.out.println();
    }
    
    static int soma(int vetor[], int fim){
        if(fim == 0){
            return vetor[fim];
        } else {
            return vetor[fim] + soma(vetor, fim - 1);
        }
    }
    
    public static void main(String[] args) {
        int quant = 5;
        int vetor[] = new int [quant];
        
        int fim = vetor.length - 1;
        
        vetor = inseriNumeros(vetor, quant);
        imprimir(vetor);
        int resultado = soma(vetor, fim);
        
        System.out.println("O resultado da soma dos numeros do vetor é igual ha " + resultado);
        
    }
}
