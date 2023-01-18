package br.com.spring.model;

import javax.persistence.*;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "administradores")
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "email", length = 180, unique = true, nullable = false)
	private String email;

	@Column(name = "senha", length = 255, nullable = false)
	private String senha;
	
	@Column(name = "observacao")
	@Type(type = "text")
	private String observacao;
	
	public Administrador() {
		
	}
	
	public Administrador(int id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}


	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	protected void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getObservacao() {
		return observacao;
	}

	protected void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}