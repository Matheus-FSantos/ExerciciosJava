package br.com.spring.domain.entity;

import java.math.BigDecimal;

public class Produto {
	private Integer id;
	private String descricao;
	private BigDecimal preco;

	public Produto() {

	}

	public Produto(Integer id, String descricao, BigDecimal preco) {
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	protected void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	protected void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}