package com.rafdev.fpdd.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Antecedente;

@Repository
public interface AntecedenteRepository extends JpaRepository<Antecedente, Long> {

	@Query("SELECT DISTINCT " + Antecedente.SIGLA + " FROM Antecedente " + Antecedente.SIGLA + " WHERE "
			+ "(:idNe is null or " + Antecedente.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + Antecedente.SIGLA
			+ ".id = :idEq) AND " + "(:nomeEn is null or " + Antecedente.SIGLA + ".nomeEn LIKE %:nomeEn%) AND "
			+ "(:nomePtBr is null or " + Antecedente.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or "
			+ Antecedente.SIGLA + ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + Antecedente.SIGLA
			+ ".status = :status)")
	Page<Antecedente> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs,
			Character status, Pageable pageRequest);

}
