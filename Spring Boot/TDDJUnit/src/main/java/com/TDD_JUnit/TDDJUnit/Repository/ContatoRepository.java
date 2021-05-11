package com.TDD_JUnit.TDDJUnit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TDD_JUnit.TDDJUnit.Model.ContatoModel;


public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}