package ExerciciosLista02;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio01BubbleSort {
	public static void main(String[] args) {
		int numeros[] = new int[5];
		inserir(numeros);
		impressao(numeros);
		System.out.println();
		numeros = bubbleSort(numeros);
		impressao(numeros);
	}
	
	private static void impressao(int[] vetor) {
		System.out.println("Array\n" + Arrays.toString(vetor));
	}

	private static void inserir(int[] vetor) {
		int numero = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
			numero = verificaNumero(vetor, numero);
			vetor[i] = numero;
		}
	}
	
	private static int verificaNumero(int[] vetor, int numero) {
		for(int i = 0; i < vetor.length; i++) {
			while(vetor[i] == numero) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero não repetido"));
			}
		}
		
		return numero;
	}

	private static int [] bubbleSort(int[] vetor) {
		int aux = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			for(int j = i + 0; j < vetor.length; j++) {
				if(vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		return vetor;
	}
}