package ExerciciosLista02;
import java.util.Arrays;

public class Exercicio02InsertionSort {
	public static void main(String[] args) {
		int quantidade = 10;
		int numeros[] = new int[quantidade];
		insere(numeros);
		System.out.println("\nDesordenado");
		imprimir(numeros);
		numeros = insertionSortRecursivo(numeros, 1, numeros.length - 1);
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
	
	private static int[] insertionSortRecursivo(int[] v, int i, int f) {
		if(i > f)
			return v;
		else {
			trocaNumeros(v, i);
			return insertionSortRecursivo(v, i + 1, f);
		}
	}

	private static void trocaNumeros(int[] v, int i) {
		int aux, j;
		
		aux = v[i];
		j = i - 1;
		
		while(j >= 0 && v[j] > aux) {
			v[j + 1] = v[j];
			j--;
		}
		
		v[j + 1] = aux;
	}
}