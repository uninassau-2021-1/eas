package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.FichaJogador;

@Repository
public interface FichaJogadorRepository extends JpaRepository<FichaJogador, Long> {

//	Page<FichaJogador> findByFilter(Long idNe, Long idEq, Classe classeEq, Raca racaEq, Antecedente antecedenteEq,
//			String nomeLike, Pageable pageRequest);

}
