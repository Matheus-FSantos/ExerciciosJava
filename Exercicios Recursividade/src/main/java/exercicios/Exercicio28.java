package Exercicios;
import java.util.Scanner;

public class Exercicio11 {
	public static int h(int m, int n) {
		if(n == 1)
			return m + 1;
		else if(m == 1)
			return n + 1;
		else
			return h(m, n - 1) + h(m - 1, n);
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		int m = leitor.nextInt();
		System.out.print("Informe o segundo numero: ");
		int n = leitor.nextInt();
		
		int resultado = h(m, n);
		
		System.out.println("h(" + m + ", "+  n + ") = " + resultado);
	}
}