package ExerciciosLista02;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercicio03QuickSortBuscaBinaria {
	public static void main(String[] args) {
		int quantidade = 5;
		int numeros[] = new int[quantidade];

		insere(numeros);
		quickSort(numeros, 0, numeros.length - 1);
		imprime(numeros);
		testaNumero(numeros);
		quickSort(numeros, 0, numeros.length - 1);
		imprime(numeros);
	}

	private static void imprime(int[] v) {
		System.out.println(Arrays.toString(v));
	}

	private static void insere(int[] v) {
		int numero = 0;

		for (int i = 0; i < v.length; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
			v[i] = numero;
		}
	}
	
	private static void testaNumero(int[] v) {
		int numero = 0;
		int resultado = 0;
		
		for(int i = 0; i < v.length; i++) {
			numero = v[i];
			
			do {
				resultado = procuraNumero(v, 0, v.length - 1, numero, i);
				if(resultado != -1) {
					numero = Integer.parseInt(JOptionPane.showInputDialog("O numero " + numero + " está repetido, informe outro numero"));
				}
			} while (resultado != -1);
			
			v[i] = numero;
		}
	}

	private static int procuraNumero(int[] v, int inicio, int fim, int numero, int index) {
		int meio = (inicio + fim)/2;
		
		//So retorna -1 quando não achar o numero
		if(inicio > fim) {
			return -1;
		}
		
		if(meio != index) {
			if(v[meio] == numero) {
				return meio;
			} else if (v[meio] > numero) {
				fim = meio - 1;
				return procuraNumero(v, inicio, fim, numero, index);
			} else {
				inicio = meio + 1;
				return procuraNumero(v, inicio, fim, numero, index);
			}
		} else {
			return -1;
		}
	}

	private static void quickSort(int[] v, int esquerda, int direita) {
		if (esquerda < direita) {
			int j = separar(v, esquerda, direita);
			quickSort(v, esquerda, j - 1);
			quickSort(v, j + 1, direita);
		}
	}

	private static int separar(int[] v, int esquerda, int direita) {
		int i = esquerda + 1;
		int j = direita;
		int pivo = v[esquerda];
		while(i <= j) {
			if(v[i] <= pivo)
				i = i + 1;
			else if (v[j] > pivo)
				j = j - 1;
			else if (i <= j) {
				trocar(v, i, j);
				i++;
				j--;
			}
		}
		trocar(v, esquerda, j);
		return j;
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = 0;
		aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
}
