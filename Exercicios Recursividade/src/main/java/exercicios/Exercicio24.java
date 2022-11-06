package Exercicios;
import java.util.Scanner;

public class Exercicio07 {
	public static String inverte(String numero, int tamanho, String numeroInvertido) {
		if(tamanho < 0) {
			return numeroInvertido;
		} else {
			numeroInvertido = numeroInvertido + numero.charAt(tamanho);
			return inverte(numero, tamanho - 1, numeroInvertido);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		String numeroString = numero + "";
		String numeroInvertido = "";
		
		numeroString = inverte(numeroString, numeroString.length() - 1, numeroInvertido);
		
		System.out.println("Numero informado: " + numero  +" Invertido " + numeroString);
	}
}