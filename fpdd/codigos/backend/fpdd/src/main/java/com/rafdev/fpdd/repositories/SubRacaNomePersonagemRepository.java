package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.SubRacaNomePersonagem;

@Repository
public interface SubRacaNomePersonagemRepository extends JpaRepository<SubRacaNomePersonagem, Long> {

//	Page<SubRacaNomePersonagem> findByFilter(Long idNe, Long idEq, SubRaca subRacaEq, NomePersonagem nomePersonagemEq,
//			Pageable pageRequest);

}
