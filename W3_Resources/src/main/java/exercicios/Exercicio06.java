/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio06 {
    
    static int []insereNumeros(int vetor[], int quant){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*100-20);
        }
        
        return vetor;
    }
    
    static int []ordenaNumeros(int vetor[], int quant){
        int j, aux;
        
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            
            while(j >= 0 && (aux < 0 && vetor[j] > 0)){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        return vetor;
    }
    
    static void imprimir(int vetor[], int quant){
        for(int elemento : vetor){
            System.out.printf("\t" + elemento);    
        }
    }
    public static void main(String[] args) {
        int quant = 10;
        int vetor[] = new int [quant];
        
        vetor = insereNumeros(vetor, quant);
        System.out.println("\n\nAntes de ordenar:");
        imprimir(vetor, quant);
        vetor = ordenaNumeros(vetor, quant);
        System.out.println("\n\nDepois de ordenar:");
        imprimir(vetor, quant);
    }
}
