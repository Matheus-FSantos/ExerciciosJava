package Exercicios;
import java.util.Scanner;

public class Exercicio12 {
	public static int soma(String numero, int resultado, int index) {
		if(index < 0)
			return resultado;
		else {
			int posicao = Integer.parseInt(numero.substring(index, index + 1));
			resultado = resultado + posicao;
			return soma(numero, resultado, index - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero: ");
		int numero = new Scanner(System.in).nextInt();
		String numeroString = numero + "";
		int resultado = 0;
		
		resultado = soma(numeroString, resultado, numeroString.length() - 1);
		
		System.out.println("Resultado = " + resultado);
	}
}