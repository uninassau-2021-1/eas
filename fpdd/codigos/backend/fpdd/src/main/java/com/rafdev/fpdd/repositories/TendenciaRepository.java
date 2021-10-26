package com.rafdev.fpdd.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Tendencia;

@Repository
public interface TendenciaRepository extends JpaRepository<Tendencia, Long> {

	@Query("SELECT DISTINCT " + Tendencia.SIGLA + " FROM Tendencia " + Tendencia.SIGLA + " WHERE "
			+ "(:idNe is null or " + Tendencia.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + Tendencia.SIGLA
			+ ".id = :idEq) AND " + "(:nomeEn is null or " + Tendencia.SIGLA + ".nomeEn LIKE %:nomeEn%) AND "
			+ "(:nomePtBr is null or " + Tendencia.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or "
			+ Tendencia.SIGLA + ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + Tendencia.SIGLA
			+ ".status = :status)")
	Page<Tendencia> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs, Character status,
			Pageable pageRequest);

}
