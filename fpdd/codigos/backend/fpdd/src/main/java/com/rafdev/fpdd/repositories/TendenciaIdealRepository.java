package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.TendenciaIdeal;

@Repository
public interface TendenciaIdealRepository extends JpaRepository<TendenciaIdeal, Long> {

//	Page<TendenciaIdeal> findByFilter(Long idNe, Long idEq, Tendencia tendenciaEq, Ideal idealEq, Pageable pageRequest);

}
