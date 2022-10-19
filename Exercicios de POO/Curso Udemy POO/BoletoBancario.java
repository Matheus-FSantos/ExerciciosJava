/**
 * 
 */
package Exercicios;
/**
 * @author mfm65
 *
 */
public class BoletoBancario{
	private int codigoDeBarras;
	private String dataDeEmissao;
	private String dataDeValidade;
	private String instituicaoBancaria;
	private String contaCorrente;
	private double precoDoBoleto;
	private int parcelas;
	
	public BoletoBancario(int numero, String dataE, String dataV, String nome, String conta, double preco, int quantidadeDeParcelas) {
		codigoDeBarras = numero;
		dataDeEmissao = dataE;
		dataDeValidade = dataV;
		instituicaoBancaria = nome;
		contaCorrente = conta;
		precoDoBoleto = preco;
		parcelas = quantidadeDeParcelas;
	}
	
	public static void main(String[] args) {
		//Primeiro Objeto
		BoletoBancario boleto1 = new BoletoBancario(99999, "11/02/2022", "11/02/2023", "Bradesco", "11111-111", 875.54, 2);
		
		System.out.println("A data de emissão do boleto é: " + boleto1.getDataDeEmissao() + " e ele é valido até o dia " + boleto1.getDataDeValidade());
		System.out.println("O seu boleto custa R$" + boleto1.getPrecoDoBoleto() + " e voce pode pagâ-lo em até " + boleto1.getParcelas() + "x");
	
	
		System.out.println("\n");
		
		//Segundo Objeto
		BoletoBancario boleto2 = new BoletoBancario(11111, "08/08/2022", "09/10/2023", "Santander", "22222-22", 678.98, 12);
		System.out.println("A data de emissão do boleto é: " + boleto2.getDataDeEmissao() + " e ele é valido até o dia " + boleto2.getDataDeValidade());
		System.out.println("O seu boleto custa R$" + boleto2.getPrecoDoBoleto() + " e voce pode pagâ-lo em até " + boleto2.getParcelas() + "x");
	
	}
	
	public void setCodigoDeBarras(int numero) {
		codigoDeBarras = numero;
	}
	
	public int getCodigoDeBarras() {
		return codigoDeBarras;
	}
	
	public void setDataDeValidade(String data) {
		dataDeValidade = data;
	}
	
	public String getDataDeValidade() {
		return dataDeValidade;
	}
	
	public void setDataDeEmissao(String data) {
		dataDeEmissao = data;
	}
	
	public String getDataDeEmissao() {
		return dataDeEmissao;
	}
	
	public void setInstituicaoBancaria(String nome) {
		instituicaoBancaria = nome;
	}
	
	public String getInstituicaoBancaria() {
		return instituicaoBancaria;
	}
	
	public void setContaCorrente(String numero) {
		contaCorrente = numero;
	}
	
	public String getContaCorrente() {
		return contaCorrente;
	}
	
	public void setPrecoDoBoleto(double preco) {
		precoDoBoleto = preco;
	}
	
	public double getPrecoDoBoleto() {
		return precoDoBoleto;
	}
	
	public void setParcelas(int numero) {
		parcelas = numero;
	}
	
	public int getParcelas() {
		return parcelas;
	}
}