package Exercicios;
import java.util.Scanner;

public class Exercicio05 {
	static int MDC(int x, int y) {
		if(x == y)
			return x;
		
		if(x > y)
			return MDC(x - y, y);
		else 
			return MDC(y, x);
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um X: ");
		int x = leitor.nextInt();
		
		System.out.print("Informe o Y: ");
		int y = leitor.nextInt();
		
		int resultado = MDC(x, y);
		
		System.out.println("MDC: " + resultado);
	}
}