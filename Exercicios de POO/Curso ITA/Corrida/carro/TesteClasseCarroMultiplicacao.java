package br.com.ITA.Heranca.carro;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;

class TesteClasseCarroMultiplicacao {
	CarroDeCorrida c = new CarroMultiplica(0, 0, " ");
	
	@BeforeEach
	public void before() {
		c = new CarroMultiplica(1.5, 100, "Ferrari");
	}
	
	@Test
	public void testeCarroParado() {
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testeAceleraUmaVez() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}
	
	@Test
	public void testeAceleraDuasVezes() {
		for(int i = 0; i < 2; i++) {
			c.acelerar();
		}
		
		assertEquals(15, c.getVelocidade());
	}
	
	@Test
	public void testeVelocidadeMaxima() {
		for(int i = 0; i < 100; i++) {
			c.acelerar();
		}
		
		assertEquals(100, c.getVelocidade());
	}
	
	@Test
	public void testeFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testeFrearAteZero() {
		for(int i = 0; i < 100; i++) {
			c.acelerar();
		}
		
		for(int i = 0; i < 100; i++) {
			c.frear();
		}
		
		assertEquals(0, c.getVelocidade());
	}
}