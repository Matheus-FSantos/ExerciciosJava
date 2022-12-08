package br.com.ITA.Heranca.carro;

public class CarroSoma extends CarroDeCorrida {
	private int potencia;
	
	public CarroSoma(int potencia, int velocidadeMaxima, String nome) {
		super(velocidadeMaxima, nome);
		setPotencia(potencia);
	}
	
	@Override
	public void acelerar() {
		setVelocidade(getVelocidade() + getPotencia());
	
		if (getVelocidade() > getVelocidadeMaxima())
			setVelocidade(getVelocidadeMaxima());
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}