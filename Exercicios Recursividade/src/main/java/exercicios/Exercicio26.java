package Exercicios;
import java.util.Scanner;

public class Exercicio09 {
	public static int varreNumero(int numero, int digito, int length, int contador) {
		String stringNumero = numero + "";
		char caracter = stringNumero.charAt(length);
		int digitoNumero = Character.getNumericValue(caracter);
		
		if(length == 0) {
			return contador;
		}
		
		if(digitoNumero == digito) {
			contador = contador + 1;
			length = length - 1;
			return varreNumero(numero, digito, length, contador);
		} else {
			length = length - 1;
			return varreNumero(numero, digito, length, contador);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um digito: ");
		int digito = new Scanner(System.in).nextInt();
		
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		String numeroString = numero + "";
		int length = (numeroString.length()) - 1;
		
		int repeticao = varreNumero(numero, digito, length, 0);
		
		System.out.println("O digito: " + digito + " repete " + repeticao + " vezes no numero: " + numero);
	}
}