package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Caracteristica;

@Repository
public interface CaracteristicaRepository extends JpaRepository<Caracteristica, Long> {

//	@Query("SELECT DISTINCT " + Caracteristica.SIGLA + " FROM Caracteristica " + Caracteristica.SIGLA + " INNER JOIN "
//			+ Caracteristica.SIGLA + ".antecedente " + Antecedente.SIGLA + " WHERE " + "(:idNe is null or "
//			+ Caracteristica.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + Caracteristica.SIGLA
//			+ ".id = :idEq) AND " + "(:nomeEn is null or " + Caracteristica.SIGLA + ".nomeEn LIKE %:nomeEn%) AND "
//			+ "(:nomePtBr is null or " + Caracteristica.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND "
//			+ "(:nomeEs is null or " + Caracteristica.SIGLA + ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or "
//			+ Caracteristica.SIGLA + ".status = :status)" + "AND (:antecedenteId is null or "
//			+ Caracteristica.SIGLA + ".antecedente.id == :antecedenteId)")
//	Page<Caracteristica> findByFilter(Long idNe, Long idEq, Long antecedenteId, String nomeEn, String nomePtBr,
//			String nomeEs, Character status, Pageable pageRequest);

}
