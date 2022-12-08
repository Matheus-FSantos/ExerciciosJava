package br.com.ITA.Heranca.carro;

public abstract class CarroDeCorrida {
	private int velocidade;
	private int velocidadeMaxima;
	private String nome;

	public CarroDeCorrida(int velocidadeMaxima, String nome) {
		setVelocidadeMaxima(velocidadeMaxima);
		setNome(nome);
		setVelocidade(0);
	}
	
	public abstract void acelerar();

	public void frear() {
		setVelocidade(getVelocidade() / 2);
		
		if(getVelocidade() <= 0)
			setVelocidade(0);
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
}