package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.TendenciaVinculo;

@Repository
public interface TendenciaVinculoRepository extends JpaRepository<TendenciaVinculo, Long> {

//	Page<TendenciaVinculo> findByFilter(Long idNe, Long idEq, Tendencia tendenciaEq, Vinculo vinculoEquals,
//			Pageable pageRequest);

}
