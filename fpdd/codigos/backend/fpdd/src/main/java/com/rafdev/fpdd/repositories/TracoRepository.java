package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Traco;

@Repository
public interface TracoRepository extends JpaRepository<Traco, Long> {

//	@Query("SELECT DISTINCT " + Traco.SIGLA + " FROM Traco " + Traco.SIGLA + " INNER JOIN " + Traco.SIGLA
//			+ ".antecedente " + Antecedente.SIGLA + " WHERE " + "(:idNe is null or " + Traco.SIGLA
//			+ ".id != :idNe) AND " + "(:idEq is null or " + Traco.SIGLA + ".id = :idEq) AND " + "(:nomeEn is null or "
//			+ Traco.SIGLA + ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or " + Traco.SIGLA
//			+ ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + Traco.SIGLA + ".nomeEs LIKE %:nomeEs%) AND "
//			+ "(:status is null or " + Traco.SIGLA + ".status = :status)" + "(:antecedenteId is null or "
//			+ Antecedente.SIGLA + " == :antecedenteId)")
//	Page<Traco> findByFilter(Long idNe, Long idEq, Long antecedenteId, String nomeEn, String nomePtBr, String nomeEs,
//			Character status, Pageable pageRequest);

}
