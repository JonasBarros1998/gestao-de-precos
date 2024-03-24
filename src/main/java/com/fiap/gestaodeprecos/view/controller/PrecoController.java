package com.fiap.gestaodeprecos.view.controller;

import com.fiap.gestaodeprecos.aplicacao.GerenciarPreco;
import com.fiap.gestaodeprecos.view.form.PrecoForm;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/produtos/precos")
public class PrecoController {

	GerenciarPreco gerenciarPreco;

	@Autowired
	PrecoController(GerenciarPreco gerenciarPreco) {
		this.gerenciarPreco = gerenciarPreco;
	}

	@PutMapping("/{id}")
	public ResponseEntity<PrecoForm> editar(@Valid @RequestBody PrecoForm precoForm, @PathVariable UUID id) {
		return ResponseEntity.status(HttpStatus.OK).body(this.gerenciarPreco.atualizar(precoForm, id));
	}
}
