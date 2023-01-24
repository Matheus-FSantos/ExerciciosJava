package br.com.spring.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido {
	private Integer id;
	private Cliente cliente;
	private LocalDate dataPedido;
	private BigDecimal total;
	
	public Pedido() {
		
	}
	
	public Pedido(Integer id, Cliente cliente, LocalDate dataPedido, BigDecimal total) {
		this.id = id;
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	protected void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	protected void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}

	public BigDecimal getTotal() {
		return total;
	}

	protected void setTotal(BigDecimal total) {
		this.total = total;
	}

}