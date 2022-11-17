package ExerciciosLista02;

import java.util.Arrays;

public class Exercicio02MergeSort {
	public static void main(String[] args) {
		int quantidade = 10;
		int numeros[] = new int[quantidade];
		int aux[] = new int [numeros.length];
		
		insere(numeros);
		System.out.println("\nDesordenado");
		imprimir(numeros);
		mergeSort(numeros, aux, 0, numeros.length-1);
		System.out.println("\nOrdenado");
		imprimir(numeros);
	}
	
	private static void imprimir(int[] v) {
		System.out.println(Arrays.toString(v));
	}

	private static void insere(int[] v) {
		for(int i = 0; i < v.length; i++) {
			v[i] = (int)(Math.random()*1000 + 1);
		}
	}
	
	private static void mergeSort(int[] v, int[] w, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim)/2;
			mergeSort(v, w, inicio, meio);
			mergeSort(v, w, meio + 1, fim);
			intercalar(v, w, inicio, meio, fim);
		}
	}

	private static void intercalar(int[] v, int[] w, int inicio, int meio, int fim) {
		for(int k = inicio; k <= fim; k++)
			w[k] = v[k];
		
		int i = inicio;
		int j = meio + 1;
		
		for(int k = inicio; k <= fim; k++) {
			if(i > meio)
				v[k] = w[j++];
			else if(j > fim)
				v[k] = w[i++];
			else if(w[i] < w[j])
				v[k] = w[i++];
			else
				v[k] = w[j++];
		}
	}
}