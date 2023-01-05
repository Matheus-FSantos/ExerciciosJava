package exercicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestesUnitarios {
	Autoridade pessoa = null;
	Autoridade pessoa2 = null;
	Autoridade pessoa3 = null;
	
	@BeforeEach
	public void before() {
		pessoa = new Autoridade("Matheus", "Ferreira", 1);
		pessoa2 = new Autoridade("Ricardo", "Augusto", 2);
		pessoa3 = new Autoridade("Antonio", "Silva", 3);
	}
	
	@Test
	public void criacaoObjetoInformal() {
		assertEquals(pessoa.getNome(), "Matheus");
		assertEquals(pessoa.getSobrenome(), "Ferreira");
		assertEquals(pessoa.getTratamento(), "Informal");
	}
	
	@Test
	public void criacaoObjetoRespeitoso() {
		assertEquals(pessoa2.getTratamento(), "Respeitoso");
		assertEquals(pessoa2.formatar(), "Sr. Augusto");
	}
	
	@Test
	public void criacaoObjetoComTitulo() {
		assertEquals(pessoa3.getTratamento(), "Com Titulo");
		assertEquals(pessoa3.formatar(), "Doutor Antonio Silva");
	}
}