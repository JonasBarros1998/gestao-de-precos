package com.fiap.gestaodeprecos.aplicacao;

import com.fiap.gestaodeprecos.dominio.Produto;
import com.fiap.gestaodeprecos.infra.repository.PrecoRepository;
import com.fiap.gestaodeprecos.view.form.PrecoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GerenciarPreco {

	PrecoRepository precoRepository;

	@Autowired
	GerenciarPreco(PrecoRepository precoRepository) {
		this.precoRepository = precoRepository;
	}

	public PrecoForm atualizar(PrecoForm precoForm, UUID id) {
		Produto produto = this.precoRepository.findById(id).orElseThrow(null);

		produto.setValor(precoForm.preco());
		this.precoRepository.save(produto);

		System.out.println(produto);

		return precoForm;
	}
}
