package br.com.ITA.avaliação;
import java.util.HashMap;
import java.util.Map;

public class TotalDeIngrediente {
	public static int quantidadeDeIngredientes = 0;
	public static Map<Integer, String> dicionarioDeIngredientes = new HashMap<Integer, String>();
	
	public static void getTotalIngredientes(String ingrediente) {
		quantidadeDeIngredientes++;
		dicionarioDeIngredientes.put(quantidadeDeIngredientes, new String(ingrediente));
	}
	
	public static String getDicionario() {
		String ingredientes = "";
		
		for(Map.Entry<Integer, String> valores: dicionarioDeIngredientes.entrySet()) {
			ingredientes = ingredientes + "\n" + valores.getValue();
		}
		
		return ingredientes;
	}
}