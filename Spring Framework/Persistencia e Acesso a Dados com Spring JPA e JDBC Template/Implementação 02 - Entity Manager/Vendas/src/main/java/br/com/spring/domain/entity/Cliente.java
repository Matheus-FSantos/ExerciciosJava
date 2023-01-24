package br.com.spring.domain.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 100, nullable = false, unique = true)
	private String nome;
	
	public Cliente() {
		
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public Cliente(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public String toString() {
		return "{" +
			   "\nId: " + this.getId() +
			   "\nNome: " + this.getNome() +
			   "\n}";
	}

	public Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}