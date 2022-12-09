package Classes;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {
	private static Map<String, Integer> produtos = new HashMap<String, Integer>();

	public void post(Object object) {
		if (object instanceof Produto) {
			Produto produto = (Produto) object;
			boolean statusProduto = verifica(produto.getNome());
			if (!statusProduto)
				produtos.put(new String(produto.getNome()), produto.getQuantidade());
			else {
				int quantidade = 0;
				
				for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
					if(valores.getKey().equalsIgnoreCase(produto.getNome())) {
						quantidade = valores.getValue() + produto.getQuantidade();
					}
				}
				
				produtos.replace(produto.getNome(), quantidade);
			}
		} else if (object instanceof ProdutoComTamanho) {
			Produto produto = (ProdutoComTamanho) object;
			boolean statusProduto = verifica(produto.getNome());
			if (!statusProduto)
				produtos.put(new String(produto.getNome()), produto.getQuantidade());
			else {
				int quantidade = 0;
				
				for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
					if(valores.getKey().equalsIgnoreCase(produto.getNome())) {
						quantidade = valores.getValue() + produto.getQuantidade();
					}
				}
				
				produtos.replace(produto.getNome(), quantidade);
			}
		}
	}

	public String get() {
		String ingredientes = "";

		for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
			ingredientes = ingredientes + "\n\nProdutos: " + valores.getKey() + "\nQuantidade: " + valores.getValue();
		}

		return ingredientes;
	}
	
	public void remove(String key, int value) {
		boolean testValue = verificar(key, value);
		
		if(!testValue) {
			for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
				if(valores.getKey().equalsIgnoreCase(key)) {
					valores.setValue(valores.getValue() - value);
				}
			}
		} else
			produtos.remove(key);
		
		get();
	}

	public String total() {
		double total = 0;
		
		for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
			total += valores.getValue();
		}
		
		return "\nTotal de produtos: " + total;
	}

	private boolean verificar(String key, int value) {
		int valor = 0;
		for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
			if(valores.getKey().equalsIgnoreCase(key)) {
				valor = valores.getValue() - value;
			}
		}
		
		if (valor != 0)
			return false;
		else
			return true;
	}

	private boolean verifica(String produto) {
		for (Map.Entry<String, Integer> valores : produtos.entrySet()) {
			if(valores.getKey().equalsIgnoreCase(produto))
				return true;
		}

		return false;
	}

	public static Map<String, Integer> getProdutos() {
		return produtos;
	}

	public static void setProdutos(Map<String, Integer> produtos) {
		CarrinhoDeCompras.produtos = produtos;
	}
}