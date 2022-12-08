package br.com.ITA.Heranca.carro;

public class Principal {
	public static void main(String[] args) {
		Corrida corrida = new Corrida(2000);
		corrida.adicionaCarro(new CarroSoma(10, 110, "Carro A"));
		corrida.adicionaCarro(new CarroSoma(20, 130, "Carro B"));
		corrida.adicionaCarro(new CarroMultiplica(1.7, 100, "Carro C"));
		corrida.adicionaCarro(new CarroMultiplica(1.4, 150, "Carro D"));
		
		corrida.largada();
	}
}