package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Ideal;

@Repository
public interface IdealRepository extends JpaRepository<Ideal, Long> {

//	@Query("SELECT DISTINCT " + Ideal.SIGLA + " FROM Ideal " + Ideal.SIGLA + " INNER JOIN " + Ideal.SIGLA
//			+ ".antecedente " + Antecedente.SIGLA + " WHERE " + "(:idNe is null or " + Ideal.SIGLA
//			+ ".id != :idNe) AND " + "(:idEq is null or " + Ideal.SIGLA + ".id = :idEq) AND " + "(:nomeEn is null or "
//			+ Ideal.SIGLA + ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or " + Ideal.SIGLA
//			+ ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + Ideal.SIGLA + ".nomeEs LIKE %:nomeEs%) AND "
//			+ "(:status is null or " + Ideal.SIGLA + ".status = :status)" + "(:antecedenteId is null or "
//			+ Antecedente.SIGLA + " == :antecedenteId)")
//	Page<Ideal> findByFilter(Long idNe, Long idEq, Long antecedenteId, String nomeEn, String nomePtBr, String nomeEs,
//			Character status, Pageable pageRequest);

}
