package ExerciciosLista02;
import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {
		int v[] = new int [10];
		insere(v);
		impressao(v);
		quickSort(v, 0, v.length - 1);
		impressao(v);
	}

	private static void impressao(int[] v) {
		System.out.println(Arrays.toString(v));
	}

	private static void insere(int[] v) {
		for(int i = 0; i < v.length; i++) {
			v[i] = (int)(Math.random()*1000+1);
		}
	}
	
	private static void quickSort(int[] v, int esquerda, int direita) {
		if(esquerda < direita) {
			int p = particao(v, esquerda, direita);
			quickSort(v, esquerda, p);
			quickSort(v, p + 1, direita);
		}
	}
	
	private static int particao(int[] v, int esquerda, int direita) {
		int meio = (int)(esquerda + direita) /2;
		int pivot = v[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		
		while(true) {
			do {
				i++;
			} while(v[i] < pivot);
			do {
				j--;
			} while(v[j] > pivot);
			
			if(i >= j) {
				return j;
			}
			
			int aux = v[i];
			v[i] = v[j];
			v[j] = aux;
		}
	}
}