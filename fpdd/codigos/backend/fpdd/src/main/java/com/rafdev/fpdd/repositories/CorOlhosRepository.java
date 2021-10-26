package com.rafdev.fpdd.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.CorOlhos;

@Repository
public interface CorOlhosRepository extends JpaRepository<CorOlhos, Long> {

	@Query("SELECT DISTINCT " + CorOlhos.SIGLA + " FROM CorOlhos " + CorOlhos.SIGLA  + " WHERE "
			+ "(:idNe is null or " + CorOlhos.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + CorOlhos.SIGLA
			+ ".id = :idEq) AND " + "(:nomeEn is null or " + CorOlhos.SIGLA + ".nomeEn LIKE %:nomeEn%) AND "
			+ "(:nomePtBr is null or " + CorOlhos.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or "
			+ CorOlhos.SIGLA + ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + CorOlhos.SIGLA
			+ ".status = :status)")
	Page<CorOlhos> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs, Character status,
			Pageable pageRequest);

}
