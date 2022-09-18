/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;
/**
 *
 * @author mfm65
 */
public class ex04 {
  public static void main(String[] args){
    int quant = 10;
    int vetor[] = new int [quant];
    
    int j = 0;
    int x = 0;
    
    int posicao = 0;
    
    //Abastece o vetor
    for(int i = 0; i < vetor.length; i++){
      vetor[i] = (int)(Math.random()*100 + 1);
    }
    
    //Insertion sort
    for(int i = 1; i < vetor.length; i++){
      j = i;
      x = vetor[j];
      
      while(j > 0 && vetor[j - 1] > x){
        vetor[j] = vetor[j - 1];
        j--;
      }
      vetor[j] = x;
    }
    
    //Move par a direita e os impares a esquerda
    for(int i = 1; i < vetor.length; i++){
        j = i;
        x = vetor[j];
        
        while(j > 0 && x %2 == 0){
            vetor[j] = vetor[j - 1];
            j--;
        }
        vetor[j] = x;
    }
    
    //Encontra o numero Impar
    for(int i = 0; i < vetor.length; i++){
        if(vetor[i] %2 == 1){
            posicao = i;
            break;
        }
    }
    
    //Ordena a parte par e a impar
    for(int i = 1; i < posicao; i++){
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
  }
}
