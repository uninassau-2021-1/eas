package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Defeito;

@Repository
public interface DefeitoRepository extends JpaRepository<Defeito, Long> {

//	@Query("SELECT DISTINCT " + Defeito.SIGLA + " FROM Defeito " + Defeito.SIGLA + " INNER JOIN " + Defeito.SIGLA
//			+ ".antecedente " + Antecedente.SIGLA + " WHERE " + "(:idNe is null or " + Defeito.SIGLA
//			+ ".id != :idNe) AND " + "(:idEq is null or " + Defeito.SIGLA + ".id = :idEq) AND " + "(:nomeEn is null or "
//			+ Defeito.SIGLA + ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or " + Defeito.SIGLA
//			+ ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + Defeito.SIGLA
//			+ ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + Defeito.SIGLA + ".status = :status)"
//			+ "(:antecedenteId is null or " + Antecedente.SIGLA + " == :antecedenteId)")
//	Page<Defeito> findByFilter(Long idNe, Long idEq, Long antecedenteId, String nomeEn, String nomePtBr, String nomeEs,
//			Character status, Pageable pageRequest);
}
