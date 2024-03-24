package com.fiap.gestaodeprecos.infra.repository;

import com.fiap.gestaodeprecos.dominio.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrecoRepository extends JpaRepository<Produto, UUID> {
}
