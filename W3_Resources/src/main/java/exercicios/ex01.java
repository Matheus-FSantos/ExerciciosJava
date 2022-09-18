/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
/**
 *
 * @author mfm65
 */
public class ex01 {
    public static void main(String[] args) {
        int quant = 5;
        int vetor[] = new int[quant];
        
        //Insertion Sort variaveis
        int aux, j;
        
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random()*100 + 1);
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
        
        for(int elemento : vetor){
            System.out.printf("\t" + elemento);
        }
    }     
}