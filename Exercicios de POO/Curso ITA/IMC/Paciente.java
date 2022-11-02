package br.com.ITA.IMC;

public class Paciente {
	private int codigo;
	private String nome;
	private int idade;
	private String telefone;
	private double peso;
	private double altura;
	private double IMC;
	
	public String toString() {
		if(this.getTelefone() != "" && this.getIdade() != 0) {
			return "Dados\nCodigo " + this.getCodigo() +
					"\nNome: " + this.getNome() +
					"\nTelefone: " + this.getTelefone() +
					"\nIdade: " + this.getIdade() +
					"\nPeso: " + this.getPeso() +
					"\nAltura: " + this.getAltura() + 
					"\nIMC: " + this.getIMC();
		} else if (this.getTelefone() != "") {
			return "Dados\nCodigo " + this.getCodigo() +
					"\nNome: " + this.getNome() +
					"\nTelefone: " + this.getTelefone() +
					"\nPeso: " + this.getPeso() +
					"\nAltura: " + this.getAltura() + 
					"\nIMC: " + this.getIMC();
		} else if (this.getIdade() != 0) {
			return "Dados\nCodigo " + this.getCodigo() +
					"\nNome: " + this.getNome() +
					"\nIdade: " + this.getIdade() +
					"\nPeso: " + this.getPeso() +
					"\nAltura: " + this.getAltura() + 
					"\nIMC: " + this.getIMC();
		} else {
			return "Dados\nNome: " + this.getNome() +
					"\nPeso: " + this.getPeso() +
					"\nAltura: " + this.getAltura() + 
					"\nIMC: " + this.getIMC();
		}
	}
	
	public String diagnostico() {
		if(getIMC() < 16.00) {
			return "O Paciente está muito abaixo do peso, muito grave!";
		} else if(getIMC() >= 16.00 && getIMC() < 16.99) {
			return "O Paciente está muito abaixo do peso, grave!";
		} else if(getIMC() >= 17.00 && getIMC() < 18.49) {
			return "O Paciente está abaixo do peso!";
		} else if(getIMC() >= 18.50 && getIMC() < 24.99) {
			return "O Paciente está com o peso adequado";
		} else if(getIMC() >= 25.00 && getIMC() < 29.99) {
			return "O Paciente está sobre o peso";
		} else if(getIMC() >= 30.00 && getIMC() < 34.99) {
			return "O Paciente está com Obesidade Grau 1";
		} else if(getIMC() >= 35 && getIMC() < 39.99) {
			return "O Paciente está com Obesidade Grau 2";
		} else {
			return "O Paciente está com Obesidade Grau 3";
		}
	}
	
	public void calcularIMC() {
		setIMC((getPeso() /(getAltura() * getAltura())));
	}
	
	public Paciente() {
		this.IMC = 0;
		this.telefone = "";
		this.idade = 0;
	}
	
	public Paciente(int codigo, String nome, double peso, double altura) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = 0;
		this.telefone = "";
		this.peso = peso;
		this.altura = altura;
		this.IMC = 0;
	}
	
	public Paciente(int codigo, String nome, int idade, String telefone, double peso, double altura) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
		this.peso = peso;
		this.altura = altura;
		this.IMC = 0;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getIMC() {
		return IMC;
	}
	
	public void setIMC(double IMC) {
		this.IMC = IMC;
	}
}