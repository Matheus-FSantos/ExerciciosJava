package br.com.ITA.avaliação;
import java.util.Map;
import java.util.HashMap;

public class CarrinhoDeCompra {
	private static int precoDaCompra = 0;
	private static int id = 0;
	private static Map<Integer, String> carrinho = new HashMap<Integer, String>();
	
	public static String mostrarCarrinho() {
		String pizzas = "";
		int id = 0;
		
		for(Map.Entry<Integer, String> valores: carrinho.entrySet()) {
			id++;
			pizzas = pizzas + "\n" + id + ". " + valores.getValue();
		}
		
		return pizzas;
	}
	
	public static void atualizaCarrinho(Pizza pizza, int preco) {
		totalCarrinho(preco);
		
		carrinho.put(id++, pizza.getNome());
	}
	
	public static void limparCarrinho() {
		carrinho.clear();
	}
	
	public static void totalCarrinho(int preco) {
		setPrecoDaCompra(getPrecoDaCompra() + preco);
	}
	
	public static int getPrecoDaCompra() {
		return precoDaCompra;
	}
	
	public static void setPrecoDaCompra(int precoDaCompra) {
		CarrinhoDeCompra.precoDaCompra = precoDaCompra;
	}
}