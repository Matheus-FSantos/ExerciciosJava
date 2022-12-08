package br.com.ITA.Heranca.carro;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteClasseCarro{
	CarroDeCorrida c = new CarroSoma(0, 0, "");
	
	@BeforeEach
	void inicializaCarro() {
		c = new CarroSoma(10, 150, "Volvo");
	}
	
	@Test
	void testeCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	void testeAcelerar() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	void testeFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	void testeFrearZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	void testeVelocidadeMaxima() {
		for(int i = 0; i < 100; i++)
			c.acelerar();
		assertEquals(150, c.getVelocidade());
	}
}