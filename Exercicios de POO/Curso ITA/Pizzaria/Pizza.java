package br.com.ITA.avaliação;
import java.util.Map;
import javax.swing.JOptionPane;
import java.util.HashMap;

public class Pizza {
	private String nome;
	private Map<Integer, String> ingredientes = new HashMap<Integer, String>();
	private int id;
	private int precoPizza;
	
	public Pizza(String nome) {
		this.nome = nome.toUpperCase();
		this.precoPizza = 0;
		this.id = 0;
	}
	
	public void adicionaIngrediente() {
		String ingrediente = JOptionPane.showInputDialog(null, "Informe o ingrediente", "Ingredientes", JOptionPane.QUESTION_MESSAGE).toUpperCase();
		setIngredientes(ingrediente);
		
		TotalDeIngrediente.getTotalIngredientes(ingrediente);
	}
	
	public static String listaDeIngredientes() {
		return TotalDeIngrediente.getDicionario();
	}
	
	public void atualizaPrecoDaPizza() {
		if(getIngredientes() <= 2)
			setPreco(15);
		else if (getIngredientes() > 2 && getIngredientes() < 6)
			setPreco(20);
		else
			setPreco(23);
	}
	
	@Override
	public String toString() {
		String ingredientesPizza = "";
		for(Map.Entry<Integer, String> valores: ingredientes.entrySet()) {
			ingredientesPizza = ingredientesPizza + "\n" + valores.getValue();
		}
		
		return  "Ingredientes: " + ingredientesPizza + 
				"\n\nQuantidade de Ingredientes: " + getIngredientes() ;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIngredientes() {
		int quantidadeDeIngredientes = 0;
		
		for(Map.Entry<Integer, String> valores: ingredientes.entrySet()) {
			quantidadeDeIngredientes++;
		}
		
		return quantidadeDeIngredientes;
	}
	
	public void setIngredientes(String texto) {
		ingredientes.put(id++, new String(texto));
	}
	
	public int getPreco() {
		return precoPizza;
	}
	
	public void setPreco(int precoPizza) {
		this.precoPizza = precoPizza;
	}
}