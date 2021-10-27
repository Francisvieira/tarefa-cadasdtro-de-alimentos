package br.com.francisalimentosdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.francisalimentosdb.model.AlimentosModel;

public interface AlimentosRepository extends JpaRepository<AlimentosModel, Long> {

}
