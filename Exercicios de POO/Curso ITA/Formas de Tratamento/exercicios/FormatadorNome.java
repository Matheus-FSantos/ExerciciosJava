package exercicios;

import javax.swing.JOptionPane;

public interface FormatadorNome {
	
	public static String formatarNome(String nome, String sobrenome, String tratamento) {
		if(tratamento.equals("Informal"))
			return informal(nome);
		else if (tratamento.equals("Respeitoso"))
			return respeitoso(Integer.parseInt(JOptionPane.showInputDialog("Informe o seu sexo\n1. Masculino\n2. Feminino")), sobrenome);
		else
			return comTitulo(JOptionPane.showInputDialog("Informe o seu titulo"), nome, sobrenome);
	}
	
	private static String informal(String nome) {
		return nome;
	}
	
	private static String respeitoso(int sexo, String sobrenome) {
		if(sexo == 1)
			return "Sr. " + sobrenome;
		else
			return "Sra. " + sobrenome;
	}
	
	private static String comTitulo(String titulo, String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}
}