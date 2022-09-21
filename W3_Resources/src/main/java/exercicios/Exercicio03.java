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
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
    int quant = 10;
    int vetor[] = new int [quant];
    int numeroBuscado = 0;
    
    int j = 0;
    int aux = 0;
    
    for(int i = 0; i < vetor.length; i++){
      vetor[i] = (int)(Math.random()*100 + 1);
    }
    
    
    //Insertion Sort
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
    
    System.out.print("\nInforme um numero: ");
    numeroBuscado = leitor.nextInt();
    
    while(numeroBuscado > vetor.length - 1){
      System.out.print("\nInforme um numero válido: ");
      numeroBuscado = leitor.nextInt();
    }
    
    System.out.println("\nO " + numeroBuscado + "º maior numero do vetor é: " + vetor[vetor.length - numeroBuscado - 1]);
  }
}