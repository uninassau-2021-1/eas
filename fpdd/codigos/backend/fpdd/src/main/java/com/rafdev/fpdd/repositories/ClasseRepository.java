package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Classe;

@Repository
public interface ClasseRepository extends JpaRepository<Classe, Long> {

//	@Query("SELECT DISTINCT " + Classe.SIGLA + " FROM Classe " + Classe.SIGLA + " WHERE " + "(:idNe is null or "
//			+ Classe.SIGLA + ".id != :idNe) AND " + "(:idEq is null or " + Classe.SIGLA + ".id = :idEq) AND "
//			+ "(:nomeEn is null or " + Classe.SIGLA + ".nomeEn LIKE %:nomeEn%) AND " + "(:nomePtBr is null or "
//			+ Classe.SIGLA + ".nomePtBr LIKE %:nomePtBr%) AND " + "(:nomeEs is null or " + Classe.SIGLA
//			+ ".nomeEs LIKE %:nomeEs%) AND " + "(:status is null or " + Classe.SIGLA + ".status = :status)")
//	Page<Classe> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs, Character status,
//			Pageable pageRequest);

}
