package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.SubRacaCorCabelo;

@Repository
public interface SubRacaCorCabeloRepository extends JpaRepository<SubRacaCorCabelo, Long> {

//	Page<SubRacaCorCabelo> findByFilter(Long idNe, Long idEq, SubRaca subRacaEq, CorCabelo corCabeloEq,
//			Pageable pageRequest);

}
