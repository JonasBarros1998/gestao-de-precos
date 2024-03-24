package com.fiap.gestaodeprecos.dominio;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "produtos")
@Embeddable
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column
	private BigDecimal valor;

	protected Produto() {}

	public Produto(BigDecimal valor) {
		this.valor = valor;
	}

	public UUID getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
