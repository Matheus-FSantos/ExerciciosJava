package Classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {
	Produto p2 = new ProdutoComTamanho("", 0.0, 0, 0.0);
	
	@BeforeEach
	public void before() {
		p2 = new ProdutoComTamanho("Calçado Social", 299.99, 2, 41);
	}
	
	@Test
	public void testeCodigo() {
		assertEquals(p2.getCodigo(), p2.getCodigo());
	}
	
	@Test
	public void testeEquals() {
		System.out.println(p2.equals(new ProdutoComTamanho("Calçado Social", 399.99, 2, 32)));
	}
	
	@Test
	public void testeInstanciaDeObjeto() {
		assertEquals("Calçado Social".toUpperCase(), p2.getNome().toUpperCase());
		assertEquals(299.99, p2.getPreco());
		System.out.print("\n" + p2.toString());
	}
}