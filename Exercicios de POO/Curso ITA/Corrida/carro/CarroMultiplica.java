package br.com.ITA.Heranca.carro;

public class CarroMultiplica extends CarroDeCorrida {
	private double potencia;	
	
	public CarroMultiplica(double potencia, int velocidadeMaxima, String nome) {
		super(velocidadeMaxima, nome);
		if(potencia >= 1 && potencia <= 2)
			setPotencia(potencia);
		else
			setPotencia(1.5);
	}
	
	@Override
	public void acelerar() {
		if(getVelocidade() == 0)
			setVelocidade(10);
		else
			setVelocidade((int) (getVelocidade() * getPotencia()));
		
		if(getVelocidade() > getVelocidadeMaxima())
			setVelocidade(getVelocidadeMaxima());
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
}
