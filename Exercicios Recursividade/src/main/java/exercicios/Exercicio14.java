/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class Exercicio14 {
	static int fatorialDuplo(int numero) {
		if(numero == 1) {
			return 1;
		} else {
			return numero * fatorialDuplo(numero - 2);
		}
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe um numero para fazer o fatorial duplo: ");
		int numero = leitor.nextInt();
		
		while(numero %2 == 0) {
			System.out.print("\nInforme um numero impar: ");
			numero = leitor.nextInt();
		}
		
		int resultado = fatorialDuplo(numero);
		System.out.println(numero + "!! = " + resultado);
	}
}
