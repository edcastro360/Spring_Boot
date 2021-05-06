package com.humanae.humanae.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.humanae.humanae.models.Parceiros;
import com.humanae.humanae.models.Produtos;

public interface ParceirosRepository extends JpaRepository<Parceiros, Long> {

	public List<Parceiros> findAllByCausaContainingIgnoreCase(String descricao);
}
