package Classes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCarrinho {
	CarrinhoDeCompras CC = new CarrinhoDeCompras();
	Produto p = new Produto("", 0.0, 0);
	Produto p2 = new ProdutoComTamanho("", 0.0, 0, 0.0);
	Produto p3 = new ProdutoComTamanho("", 0.0, 0, 0.0);
	Produto p4 = new ProdutoComTamanho("", 0.0, 0, 0.0);
	
	
	@BeforeEach
	public void before() {
		p = new Produto("Video Game", 2999.99, 1);
		p2 = new ProdutoComTamanho("Calçado Social", 299.99, 2, 41);
		p3 = new ProdutoComTamanho("Calçado Social", 299.99, 10, 39);
		p4 = new ProdutoComTamanho("Calçado Casual", 299.99, 1, 41);
	}
	
	@Test
	public void testePost() {
		CC.post(p);
		CC.post(p2);
		CC.post(p3);
		CC.post(p4);
	}
	
	@Test
	public void testeGet() {
		System.out.println(CC.get());
		System.out.println();
	}
	
	@Test
	public void testeTotalProdutos() {
		System.out.println("=======================" + 
						   "\n\n" + CC.total());
		
		testeRemove();
	}
	
	private void testeRemove() {
		CC.remove("Video Game", 1);
		System.out.println("\n\n" + "=======================");
		testeGet();
	}
}