package Exercicios;
import java.util.Scanner;

public class Exercicio06 {
	static int MOD(int x, int y) {
		if(x == y)
			return 0;
		
		if(x > y) {
			return MOD(x - y, y);
		} else 
			return x;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o X: ");
		int x = leitor.nextInt();
		
		System.out.print("Informe o Y: ");
		int y = leitor.nextInt();
		
		int resultado = MOD(x, y);
		
		System.out.println(x + ".mod(" + y + ") = " + resultado);
	}
}