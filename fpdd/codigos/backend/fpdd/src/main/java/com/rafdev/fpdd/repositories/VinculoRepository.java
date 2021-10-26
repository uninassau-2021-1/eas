package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Vinculo;

@Repository
public interface VinculoRepository extends JpaRepository<Vinculo, Long> {

//	@Query("SELECT DISTINCT " + Vinculo.SIGLA + " FROM Vinculo " + Vinculo.SIGLA + " INNER JOIN " + Vinculo.SIGLA
//			+ ".antecedente " + Antecedente.SIGLA + " WHERE " + "(:idNe is null or " + Vinculo.SIGLA
//			+ ".id != :idNe) AND " + "(:idEq is null or " + Vinculo.SIGLA + ".id = :idEq) AND " + "(:nomeEn is null or "
//			+ Vinculo.SIGLA + ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or " + Vinculo.SIGLA
//			+ ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + Vinculo.SIGLA
//			+ ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + Vinculo.SIGLA + ".status = :status)"
//			+ "(:antecedenteId is null or " + Antecedente.SIGLA + " == :antecedenteId)")
//	Page<Vinculo> findByFilter(Long idNe, Long idEq, Long antecedenteId, String nomeEn, String nomePtBr, String nomeEs,
//			Character status, Pageable pageRequest);

}
