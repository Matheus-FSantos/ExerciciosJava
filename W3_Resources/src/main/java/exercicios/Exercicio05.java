/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio05 {
    
    static int [] insereNumeros(int vetor[], int quant){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*2);
        }
        return vetor;
    }
    
    static void imprimir(int vetor[], int quant){
        int j, aux;
        
        System.out.println("\n\nVetor:");
        for(int elemento : vetor){
             System.out.printf("\t" + elemento);
        }
        
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        
        System.out.println("\n\nVetor ordenado");
        for(int elemento : vetor){
            System.out.printf("\t" + elemento);
        }
    }
    
    public static void main(String[] args) {
        int quant = 10;
        int vetor[] = new int [quant];
        
        vetor = insereNumeros(vetor, quant);
        imprimir(vetor, quant);
    }
}
