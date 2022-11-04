package br.com.ado.exercicio01;
import javax.swing.JOptionPane;

public class Exercicio01 {
	private int topo = -1;
	private int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de palavras que deseja registrar", "Digite um valor", JOptionPane.QUESTION_MESSAGE));
	private String palavras[] = new String[tamanho];
	private String palavrasInvertidas[] = new String [palavras.length];
	
	public void push(String elemento) {
		boolean teste = false;
		topo++;
		teste = verificaPilha();
		
		if(teste == true) {
			topo--;
			JOptionPane.showMessageDialog(null, "A Pilha está cheia", "Pilha", JOptionPane.ERROR_MESSAGE);
		} else {
			palavras[topo] = elemento;
			String parametro = "";
			
			for(int i = elemento.length(); 0 < i; i--) {
				parametro = parametro + elemento.charAt(i - 1);
			}
			
			palavrasInvertidas[topo] = parametro;
		}
	}
	
	public String pop() {
		boolean teste = false;
		String elemento = "";
		teste = verificaPilha2();
		
		if(teste == true) {
			JOptionPane.showMessageDialog(null, "A Pilha está vazia", "Pilha", JOptionPane.ERROR_MESSAGE);
		} else {
			elemento = palavras[topo];
			
			palavras[topo] = null;
			palavrasInvertidas[topo] = null;
			
			topo--;
		}
		
		return elemento;
	}
	
	public String getPilha() {
		String texto = "";
		
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i] != null) {
				texto = palavras[i] + "\n" + texto;
			}
		}
		
		return texto;
	}
	
	public String getPilhaInvertida() {
		String texto = "";
		
		for(int i = 0; i < palavrasInvertidas.length; i++) {
			if(palavrasInvertidas[i] != null) {
				texto = palavrasInvertidas[i] + "\n" + texto;
			}
		}
		
		return texto;
	}
	
	public boolean verificaPilha() {
		if(topo == tamanho) {
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