package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.SubRacaCorOlhos;

@Repository
public interface SubRacaCorOlhosRepository extends JpaRepository<SubRacaCorOlhos, Long> {

//	Page<SubRacaCorOlhos> findByFilter(Long idNe, Long idEq, SubRaca subRacaEq, CorOlhos corOlhosEq,
//			Pageable pageRequest);

}
