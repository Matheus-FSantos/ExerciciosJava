/**
 * 
 */
package Exercicios;
/**
 * @author mfm65
 *
 */
public class Conta {
	private String numeroDaConta;
	private double saldo;
	
	public Conta(String codigoDaConta, double saldoInicial) {
		saldo = saldoInicial;
		numeroDaConta = codigoDaConta;
	}
	
	
	public static void main(String[] args) {
		Conta contaUsuario = new Conta("111-1", 2000.00);
		System.out.println("A conta " + contaUsuario.getNumero() + " possui: R$ " + contaUsuario.getSaldo());
		
		contaUsuario.debitar(100);
		System.out.println("novo saldo: R$" + contaUsuario.getSaldo());
		
		contaUsuario.creditar(100);
		System.out.println("novo saldo: R$" + contaUsuario.getSaldo());
	}
	
	
	public void setNumero(String novoNumeroDeConta) {
		numeroDaConta = novoNumeroDeConta;
	}

	public String getNumero() {
		return numeroDaConta;
	}
	
	public void setSaldo(double novoSaldo) {
		saldo = novoSaldo;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void debitar(double valor) {
		saldo = (saldo - valor);
	}
	
	public void creditar(double valor) {
		saldo = (saldo + valor);
	}
}