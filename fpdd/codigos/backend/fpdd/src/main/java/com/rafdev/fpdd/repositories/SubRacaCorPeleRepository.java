package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.SubRacaCorPele;

@Repository
public interface SubRacaCorPeleRepository extends JpaRepository<SubRacaCorPele, Long> {

//	Page<SubRacaCorPele> findByFilter(Long idNe, Long idEq, SubRaca subRacaEq, CorPele corPeleEq, Pageable pageRequest);

}
