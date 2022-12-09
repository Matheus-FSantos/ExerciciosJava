package Classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteEquals {
	Produto p = new Produto("", 0.0, 0);
	Produto p2 = new ProdutoComTamanho("", 0.0, 0, 0.0);

	@BeforeEach
	public void before() {
		p = new Produto("Video Game", 2999.99, 1);
		p2 = new ProdutoComTamanho("Calçado Social", 299.99, 2, 41);
	}
	
	@Test
	public void testeEquals() {
		System.out.println(p2.equals(p));
	}
}