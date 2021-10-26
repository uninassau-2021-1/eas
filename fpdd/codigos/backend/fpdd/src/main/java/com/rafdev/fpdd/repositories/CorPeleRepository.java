package com.rafdev.fpdd.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.CorPele;

@Repository
public interface CorPeleRepository extends JpaRepository<CorPele, Long> {

	@Query("SELECT DISTINCT " + CorPele.SIGLA + " FROM CorPele " + CorPele.SIGLA + " WHERE " + "(:idNe is null or "
			+ CorPele.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + CorPele.SIGLA + ".id = :idEq) AND "
			+ "(:nomeEn is null or " + CorPele.SIGLA + ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or "
			+ CorPele.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + CorPele.SIGLA
			+ ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + CorPele.SIGLA + ".status = :status)")
	Page<CorPele> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs, Character status,
			Pageable pageRequest);

}
