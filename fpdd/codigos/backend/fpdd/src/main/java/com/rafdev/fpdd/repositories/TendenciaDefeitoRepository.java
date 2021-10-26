package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.TendenciaDefeito;

@Repository
public interface TendenciaDefeitoRepository extends JpaRepository<TendenciaDefeito, Long> {

//	Page<TendenciaDefeito> findByFilter(Long idNe, Long idEq, Tendencia tendenciaEq, Defeito defeitoEq,
//			Pageable pageRequest);

}