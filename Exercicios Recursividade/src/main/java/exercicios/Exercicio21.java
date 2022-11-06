package Exercicios;
import java.util.Scanner;

public class Exercicio04 {
	static String transforma(int decimal, String binario) {
		if(decimal == 0) {
			return binario;
		} else {
			binario = (decimal%2) + binario;
			return transforma(decimal/2, binario);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		String binario = "";
		
		
		binario = transforma(numero, binario);
		
		System.out.print("\nDecimal: " + numero + "\nBinario: " + binario);
	}
}