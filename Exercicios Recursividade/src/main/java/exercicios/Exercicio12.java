/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class Exercicio12 {
	static int []inserir(int vetor[]){
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int)(Math.random()*100+1);
		}
		return vetor;
	}
	
	static void impressao(int vetor[]) {
		for(int elemento : vetor) {
			System.out.printf(elemento + "\t");
		}
	}
	
	static int []ordenacao(int vetor[], int inicio, int fim, int aux, int meio){
		if(meio == 0) {
			return vetor;
		} else {
			aux = vetor[inicio];
			vetor[inicio] = vetor[fim];
			vetor[fim] = aux;
			return ordenacao(vetor, inicio + 1, fim - 1, aux, meio - 1);
		}
	}
	public static void main(String[] args) {
		System.out.print("Informe a quantidade de numeros que deseja ter no vetor: ");
		int quant = new Scanner(System.in).nextInt();
		int vetor[] = new int [quant];
		
		
		int inicio = 0;
		int fim = vetor.length - 1;
		int aux = 0;
		
		int meio = quant/2;
		
		
		vetor = inserir(vetor);
		System.out.println("Vetor Normal");
		impressao(vetor);
		vetor = ordenacao(vetor, inicio, fim, aux, meio);
		System.out.println();
		System.out.println("Vetor Alterado");
		impressao(vetor);
	}
}