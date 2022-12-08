package br.com.ITA.Heranca.carro;

import java.util.HashMap;
import java.util.Map;

public class Corrida {
	private int pista;
	private Map<CarroDeCorrida, Integer> carros = new HashMap<>();

	public Corrida(int pista) {
		this.pista = pista;
	}
	
	public void adicionaCarro(CarroDeCorrida c) {
		carros.put(c, 0);
	}
	
	private boolean statusCorrida() {
		for(Integer valor : carros.values()) {
			if(valor >= pista)
				return true;
		}
		
		return false;
	}
	
	public void largada() {
		while(!statusCorrida()) {
			for(CarroDeCorrida carro : carros.keySet()) {
				carro.acelerar();
				int distancia = carros.get(carro);
				distancia += carro.getVelocidade();
				carros.put(carro, distancia);
			}
		}
		
		for(CarroDeCorrida carro : carros.keySet()) {
			System.out.println(carro.getNome() + " - " + carros.get(carro));
		}
	}

	public int getPista() {
		return pista;
	}

	public void setPista(int pista) {
		this.pista = pista;
	}
}