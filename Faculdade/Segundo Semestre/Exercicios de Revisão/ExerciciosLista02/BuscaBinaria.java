package ExerciciosLista02;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {
	public static void main(String[] args) {
		int v[]= new int [10];
		inserir(v);
		insertionSort(v);
		imprimir(v);
		
		
		System.out.print("Informe um numero que deseja buscar no vetor: ");
		int numero = new Scanner(System.in).nextInt();
		
		int index = buscaBinaria(v, numero);
		
		if(numero != -1) 
			System.out.println("O numero " + numero + " foi encontrado na posicao: " + (index + 1) + " no vetor acima");
		else
			System.out.println("O numero informado não foi encontrado no vetor acima");
	}

	private static void imprimir(int[] v) {
		System.out.println(Arrays.toString(v));
	}

	private static void inserir(int[] v) {
		for(int i = 0; i < v.length; i++) {
			v[i] = (int)(Math.random()*100+1);
		}
	}
	
	private static void insertionSort(int[] v) {
		int aux, j;
		for(int i = 1; i < v.length; i++) {
			aux = v[i];
			j = i - 1;
			
			while(j >= 0 && v[j] > aux) {
				v[j + 1] = v[j];
				j--;
			}
			
			v[j + 1] = aux;
		}
	}
	
	private static int buscaBinaria(int[] v, int numero) {
		int inicio = 0;
		int fim = v.length;
		int meio = 0;
		
		while(inicio <= fim) {
			meio = (inicio + fim) /2;
			
			if(v[meio] == numero)
				return meio;
			else if(v[meio] < numero)
				inicio = meio + 1;
			else
				fim = meio - 1;
		}
		
		return -1;
	}
}