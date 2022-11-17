package ExerciciosLista02;

import java.util.Arrays;

public class Exercicio03QuickSortBuscaBinaria {
	public static void main(String[] args) {
		int quantidade = 5;
		int numeros[] = new int[quantidade];

		insere(numeros);
		quickSort(numeros, 0, numeros.length - 1);
		imprime(numeros);
	}

	private static void imprime(int[] v) {
		System.out.println(Arrays.toString(v));
	}

	private static void insere(int[] v) {
		//int numero = 0;

		for (int i = 0; i < v.length - 1; i++) {
			//numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
			v[i] = (int)(Math.random()*1000+1);
		}
	}

	private static void quickSort(int[] v, int esquerda, int direita) {
		int p = 0;

		if (esquerda < direita) {
			p = particao(v, esquerda, direita);
			quickSort(v, esquerda, p);
			quickSort(v, p + 1, direita);
		}
	}

	private static int particao(int[] v, int esquerda, int direita) {
		int meio = (int) (esquerda + direita) / 2;
		int pivot = v[meio];
		int i = esquerda - 1;
		int j = direita + 1;

		while (true) {
			do {
				i++;
			} while (v[i] < pivot);

			do {
				j--;
			} while (v[i] > pivot);

			if (i >= j)
				return j;
			int aux = v[i];
			v[i] = v[j];
			v[j] = aux;
		}
	}
}