package exercicios;

import javax.swing.JOptionPane;

public class Autoridade {
	String nome;
	String sobrenome;
	String tratamento;

	public Autoridade(String nome, String sobrenome, int opcao) {
		this.nome = nome;
		this.sobrenome = sobrenome;

		if (opcao == 1)
			this.tratamento = "Informal";
		else if (opcao == 2)
			this.tratamento = "Respeitoso";
		else
			this.tratamento = "Com Titulo";
	}

	public String formatar() {
		return FormatadorNome.formatarNome(this.getNome(), this.getSobrenome(), this.getTratamento());
	}
	
	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	private void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getTratamento() {
		return tratamento;
	}
	
	private void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
}