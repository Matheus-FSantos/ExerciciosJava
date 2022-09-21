/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author mfm65
 */
public class Exercicio07 {
    
    static int []inserirNumeros(int vetorA[], int quant){
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)(Math.random()*10);
        }
        return vetorA;
    }
    
    static int []inserirNumeros2(int vetorB[], int quant){
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = (int)(Math.random()*10);
        }
        return vetorB;
    }
    
    static int []insertionSort(int vetorA[], int quant){
        int aux, j;
        
        for(int i = 1; i < vetorA.length; i++){
            aux = vetorA[i];
            j = i - 1;
            
            while(j >= 0 && vetorA[j] > aux){
                vetorA[j + 1] = vetorA[j];
                j--;
            }
            vetorA[j + 1] = aux;
        }
        return vetorA;
    }
    
    static int []insertionSort2(int vetorB[], int quant){
        int aux, j;
        
        for(int i = 1; i < vetorB.length; i++){
            aux = vetorB[i];
            j = i - 1;
            
            while(j >= 0 && vetorB[j] > aux){
                vetorB[j + 1] = vetorB[j];
                j--;
            }
            vetorB[j + 1] = aux;
        }
        return vetorB;
    }
    
    static void buscaLinear(int vetorA[], int vetorB[], int vetorC[], int quant){
        for(int i = 0; i < quant; i++){
            for(int j = 0; j < quant; j++){
                if(vetorA[i] == vetorB[j]){
                    vetorC[j] = vetorB[j];
                }
            }
        }
        
        for(int i = 0; i < vetorC.length; i++){
            if(vetorC[i] != 0){
                System.out.printf("\t" + vetorC[i]);
            }
        }
    }
    public static void main(String[] args) {
        int quant = 5;
        
        int vetorA[] = new int[quant];
        int vetorB[] = new int [quant];
        int vetorC[] = new int [quant];
        
        vetorA = inserirNumeros(vetorA, quant);
        vetorB = inserirNumeros2(vetorB, quant);
        
        vetorA = insertionSort(vetorA, quant);
        System.out.println();
        for(int elemento : vetorA){
            System.out.printf("\t" + elemento);
        }
        
        vetorB = insertionSort(vetorB, quant);
        System.out.println();
        for(int elemento : vetorB){
            System.out.printf("\t" + elemento);
        }
        
        System.out.println();
        System.out.print("Numeros que repetem:");
        buscaLinear(vetorA, vetorB, vetorC, quant);
    }
}
