/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class exercicio13 {
	static int fibonacci(int numero) {
		if (numero == 1 || numero == 0) {
			return numero; 
		} else {
			return fibonacci(numero - 1) + fibonacci(numero - 2);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero para ver o fatorial: ");
		int numero = new Scanner(System.in).nextInt();
		int resultado = fibonacci(numero);
		System.out.println("F(" + numero + ") = " + resultado);
	}
}