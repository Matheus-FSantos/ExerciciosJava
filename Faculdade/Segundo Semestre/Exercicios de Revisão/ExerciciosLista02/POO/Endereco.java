package ExerciciosLista02.POO;

public class Endereco {
	private int cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String UF;
	
	public Endereco(int cep, String logradouro, String bairro, String cidade, String UF) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = UF;
	}
	
	@Override
	public String toString() {
		return "CEP: " + this.getCep() +
			   "\nLogradouro: " + this.getLogradouro() +
			   "\nBairro: " + this.getBairro() +
			   "\nCidade: " + this.getCidade() +
			   "\nUF: " + this.getUF();
	}
	
	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String UF) {
		this.UF = UF;
	}
}