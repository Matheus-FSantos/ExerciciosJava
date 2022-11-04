package br.com.ado.exercicio02;
import javax.swing.JOptionPane;

public class Exercicio02 {
	private int topo = -1;
	private int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho da pilha"));
	private int binarios[] = new int [tamanho];
	private int decimais[] = new int [tamanho];
	
	public void push(int decimal) {
		boolean teste = false;
		String textoBinario = "";
		int numeroBinario = 0;
		teste = verificaPilha();
		
		if(teste == true) {
			JOptionPane.showMessageDialog(null, "A pilha está cheia", "Erro", JOptionPane.ERROR_MESSAGE);
		} else {
			topo++;
			textoBinario = transformaBinario(decimal, textoBinario);
			numeroBinario = Integer.parseInt(textoBinario);
			
			decimais[topo] = decimal;
			binarios[topo] = numeroBinario;
		}
	}
	
	public int pop() {
		boolean teste = false;
		int numero = 0;
		teste = verificaPilha2();
		
		if(teste == true) {
			JOptionPane.showMessageDialog(null, "A pilha está vazia", "Erro", JOptionPane.ERROR_MESSAGE);
		} else {
			numero = decimais[topo];
			decimais[topo] = 0;
			binarios[topo] = 0;
			topo--;
		}
		
		return numero;
	}
	
	public String getPilha() {
		String texto = "";
		
		for(int i = 0; i < binarios.length; i++) {
			if(binarios[i] != 0) {
				texto = binarios[i] + "\n" + texto;
			}
		}
		
		return texto;
	}
	
	public String transformaBinario(int numero, String texto) {
		if(numero > 0) {
			texto = (numero %2) + texto ;
			return transformaBinario(numero/2, texto);
		}
		return texto;
	}
	
	public boolean verificaPilha() {
		if(topo == tamanho - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean verificaPilha2() {
		if(topo == -1) {
			return true;
		} else {
			return false;
		}
	}
}