package ExerciciosLista02;
import java.util.Arrays;

public class ImparParaUmLadoQuickSort {
	public static void main(String[] args) {
		int v[] = new int [10];
		insere(v);
		imprime(v);
		trocaNumeros(v);
		int index = acharPrimeiroImpar(v);
		quickSort(v, 0, index - 1);
		quickSort(v, index, v.length - 1);
		imprime(v);
		
		System.out.println(index);
	}

	private static void imprime(int[] v) {
		System.out.println();
		System.out.println(Arrays.toString(v));
	}

	private static void insere(int[] v) {
		for(int i = 0; i < v.length; i++) {
			v[i] = (int)(Math.random()*100+1);
		}
	}
	
	private static void trocaNumeros(int[] v) {
		int aux = 0;
		
		for(int i = 0; i < v.length - 1; i++) {
			for(int j = i + 0; j < v.length; j++) {
				if(v[i] %2 == 1 && v[j] %2 == 0) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
	}
	
	private static int acharPrimeiroImpar(int[] v) {
		int index = 0;
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] %2 == 1) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	private static void quickSort(int[] v, int esquerda, int direita) {
		if(esquerda < direita) {
			int p = particao(v, esquerda, direita);
			quickSort(v, esquerda, p);
			quickSort(v, p + 1, direita);
		}
	}

	private static int particao(int[] v, int esquerda, int direita) {
		int meio = (esquerda + direita) /2;
		int pivot = v[meio];
		int i = esquerda - 1;
		int j = direita + 1;
		
		while(true) {
			do {
				i++;
			} while (v[i] < pivot);
			
			do {
				j--;
			} while (v[j] > pivot);
			
			if(i >= j) {
				return j;
			}
			
			int aux = v[i];
			v[i] = v[j];
			v[j] = aux;
		}
	}
}