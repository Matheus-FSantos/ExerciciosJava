package ExerciciosLista02.POO;

public class Aluno {
	private static int idDinamico;
	
	private int id;
	private String nome;
	private Endereco endereco;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, double nota1, double nota2, Endereco endereco) {
		idDinamico = idDinamico + 1;
		setId(idDinamico);
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.getId() +
			   "\nNome: " + this.getNome() + 
			   "\nNota 01: " + this.getNota1() +
			   "\nNota 02: " + this.getNota2() +
			   "\nEndereco: " + this.getEndereco();   
	}

	public double calculaMedia() {
		double media = 0;
		media = (this.getNota1() + this.getNota2()) /2;
		
		return media;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}