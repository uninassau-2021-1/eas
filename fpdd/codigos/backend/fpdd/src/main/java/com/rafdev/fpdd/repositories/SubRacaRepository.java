package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.SubRaca;

@Repository
public interface SubRacaRepository extends JpaRepository<SubRaca, Long> {

//	Page<SubRaca> findByFilter(Long idNe, Long idEq, Raca racaEq, String nomeEn, String nomePtBr, String nomeEs,
//			Character status, Pageable pageRequest);

}
