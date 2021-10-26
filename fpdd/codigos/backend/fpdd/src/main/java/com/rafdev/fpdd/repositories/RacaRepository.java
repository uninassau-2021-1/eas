package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Raca;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Long> {

//	Page<Raca> findByFilter(Long idNe, Long idEq, String nomeEn, String nomePtBr, String nomeEs, Short alturaMaxEq,
//			Short alturaMinEq, Float pesoMaxEq, Float pesoMinEq, Short idadeMaxEq, Short idadeMinEq, Character status,
//			Pageable pageRequest);

}
