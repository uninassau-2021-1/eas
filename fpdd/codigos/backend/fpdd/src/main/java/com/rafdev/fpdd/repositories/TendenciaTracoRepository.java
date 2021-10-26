package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.TendenciaTraco;

@Repository
public interface TendenciaTracoRepository extends JpaRepository<TendenciaTraco, Long> {

//	Page<TendenciaTraco> findByFilter(Long idNe, Long idEq, Tendencia tendenciaEq, Traco tracoEq, Pageable pageRequest);

}
