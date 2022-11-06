package Exercicios;
import java.util.Scanner;

public class Exercicio08 {
	public static int fatorial(int numero) {
		if(numero == 1 || numero == 0)
			return 1;
		else 
			return numero * fatorial(numero - 1);
	}
	
	public static int superFatorial(int numero) {
		if (numero == 1)
			return numero;
		else
			return fatorial(numero) * superFatorial(numero - 1);
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		
		int resultado = superFatorial(numero);
		System.out.println("S(" + numero + ") = " + resultado);
	}
}