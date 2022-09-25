/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class exercicio11 {
	
	static int fatorial(int numero) {
		if (numero == 1) {
			return 1;
		} else {
			return numero * fatorial(numero - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		
		int resultado = fatorial(numero);
		System.out.printf("\n" + numero + "! = " + resultado);
	}
}