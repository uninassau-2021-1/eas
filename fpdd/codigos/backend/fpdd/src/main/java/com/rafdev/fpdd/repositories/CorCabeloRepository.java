package com.rafdev.fpdd.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.CorCabelo;

@Repository
public interface CorCabeloRepository extends JpaRepository<CorCabelo, Long> {

	@Query("SELECT DISTINCT " + CorCabelo.SIGLA + " FROM CorCabelo " + CorCabelo.SIGLA + " WHERE "
			+ "(:idNe is null or " + CorCabelo.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + CorCabelo.SIGLA
			+ ".id = :idEq) AND " + "(:nomeEn is null or " + CorCabelo.SIGLA + ".nomeEn LIKE %:nomeEn%) AND "
			+ "(:nomePtBr is null or " + CorCabelo.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or "
			+ CorCabelo.SIGLA + ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + CorCabelo.SIGLA
			+ ".status = :status)")
	Page<CorCabelo> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs, Character status,
			Pageable pageRequest);

}
