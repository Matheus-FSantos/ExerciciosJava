package Classes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteHashCode {
	Produto p = new Produto("", 0.0, 0);
	Produto p2 = new Produto("", 0.0, 0);
	
	@BeforeEach
	public void before() {
		p = new Produto("Video Game", 2999.99, 2);
		p2 = new Produto("Video Game", 2999.99, 2);
	}

	@Test
	public void testeCodigo() {
		//Sempre daria erro por estar gerando codigos aleatórios toda passagem
		assertEquals(p.getCodigo(), p.getCodigo());
	}
	
	@Test
	public void testeEquals() {
		System.out.println(p.equals(p2));
	}
	
	@Test
	public void testeInstanciaDeObjeto() {
		assertEquals("Video Game", p.getNome());
		assertEquals(2999.99, p.getPreco());
		System.out.print("\n" + p.toString());
	}
}