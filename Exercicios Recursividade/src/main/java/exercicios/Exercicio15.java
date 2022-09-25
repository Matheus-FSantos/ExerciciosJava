/**
 * 
 */
package exercicios;
import java.util.Scanner;
/**
 * @author mfm65
 *
 */
public class Exercicio15 {
	static int fatorialQuadruploDividendo(int dividendo) {
		if(dividendo == 1) {
			return 1;
		} else {
			return dividendo * fatorialQuadruploDividendo(dividendo - 1);
		}
	}

	static int fatorialQuadruploDivisor(int divisor) {
		if(divisor == 1) {
			return 1; 
		} else {
			return divisor * fatorialQuadruploDivisor(divisor - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Informe um numero para ver o fatorial quadruplo: ");
		int divisor = new Scanner(System.in).nextInt();
		int dividendo = divisor * 2;
		
		int resultadoDivisor = 0;
		int resultadoDividendo = 0;
		
		resultadoDivisor = fatorialQuadruploDivisor(divisor);
		resultadoDividendo = fatorialQuadruploDividendo(dividendo);
		
		int quociente = resultadoDividendo /resultadoDivisor;
		
		System.out.println(dividendo + "! /" + divisor + "! = " + quociente);
	}
}