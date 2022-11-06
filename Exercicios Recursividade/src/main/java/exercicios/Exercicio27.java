package Exercicios;
import java.util.Scanner;

public class Exercicio10 {
	public static int exponencial(int numero) {
		if(numero == 1 || numero == 0)
			return 1;
		else
			return numero * exponencial(numero - 1);
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		
		int resultado = exponencial(numero);
		System.out.println("Fatorial exponencial de " + numero + " = " + resultado);
	}
}