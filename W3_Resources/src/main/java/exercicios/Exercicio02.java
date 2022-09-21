/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
/**
 *
 * @author mfm65
 */
public class Exercicio02 {
  public static void main(String[] args){
    int quant = 10;
    int vetor[] = new int [quant];
    
    int j = 0;
    int x = 0;
    
    for(int i = 0; i < vetor.length; i++){
      vetor[i] = (int)(Math.random()*100 + 1);
    }
    
    
    //Insertion Sort
    for(int i = 1; i < vetor.length; i++){
      j = i;
      x = vetor[j];
      
      while(j > 0 && vetor[j - 1] > x){
        vetor[j] = vetor[j - 1];
        j--;
      }
      vetor[j] = x;
    }
    
    
    for(int elemento : vetor){
      System.out.printf("\t" + elemento);
    }
    System.out.println("O maior numero do vetor é: " + vetor[vetor.length - 1]);
    System.out.println("O terceiro maior numero do vetor é: " + vetor[vetor.length - 2]);
    System.out.println("O segundo maior numero do vetor é: " + vetor[vetor.length - 3]);
  }
}