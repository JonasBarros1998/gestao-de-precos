package com.fiap.gestaodeprecos.view.form;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PrecoForm(

	@NotNull(message = "o atributo preco e obrigatorio")
	BigDecimal preco

) {
}
