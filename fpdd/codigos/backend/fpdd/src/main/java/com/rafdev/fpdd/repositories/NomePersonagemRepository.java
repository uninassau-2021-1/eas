package com.rafdev.fpdd.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.NomePersonagem;

@Repository
public interface NomePersonagemRepository extends JpaRepository<NomePersonagem, Long> {

	@Query("SELECT DISTINCT " + NomePersonagem.SIGLA + " FROM NomePersonagem " + NomePersonagem.SIGLA + " WHERE "
			+ "(:idNe is null or " + NomePersonagem.SIGLA + ".id != :idNe) AND " + "(:idEq is null or "
			+ NomePersonagem.SIGLA + ".id = :idEq) AND " + "(:nomeEn is null or " + NomePersonagem.SIGLA
			+ ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or " + NomePersonagem.SIGLA
			+ ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + NomePersonagem.SIGLA
			+ ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + NomePersonagem.SIGLA + ".status = :status)")
	Page<NomePersonagem> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs,
			Character status, Pageable pageRequest);

}
