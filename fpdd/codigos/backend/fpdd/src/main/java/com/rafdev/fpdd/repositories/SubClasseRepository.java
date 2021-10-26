package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.SubClasse;

@Repository
public interface SubClasseRepository extends JpaRepository<SubClasse, Long> {

//	Page<SubClasse> findByFilter(Long idNe, Long idEq, Classe classeEq, String nomeEn, String nomePtBr, String nomeEs,
//			Character status, Pageable pageRequest);

}
