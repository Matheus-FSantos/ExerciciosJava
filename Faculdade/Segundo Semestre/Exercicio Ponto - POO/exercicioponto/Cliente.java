/**
 * 
 */
package br.com.senacsp.algoritmos2.exercicioponto;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class Cliente {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Informe a coordenada X do primeiro ponto: ");
		int x = leitor.nextInt();
		System.out.print("Informe a coordenada Y do primeiro ponto: ");
		int y = leitor.nextInt();
		
		Ponto ponto1 = new Ponto(x, y);
		
		System.out.println();
		System.out.print("Informe a coordenada X do segundo ponto: ");
		x = leitor.nextInt();
		System.out.print("Informe a coordenada Y do segundo ponto: ");
		y = leitor.nextInt();
		
		Ponto ponto2= new Ponto(x, y);
		
		int distancia = ponto1.distancia(ponto2);
		boolean igualdade = ponto1.igual(ponto2);
		
		System.out.println();
		System.out.println("Distancia dos pontos: " + distancia + "px");
		
		System.out.println();
		if(igualdade == true) {
			System.out.println("Estão no mesmo lugar");
		} else {
			System.out.println("Estão em pontos diferentes");
		}
	}
}