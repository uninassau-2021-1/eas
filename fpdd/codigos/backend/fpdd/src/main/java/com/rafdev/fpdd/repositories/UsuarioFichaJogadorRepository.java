package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.UsuarioFichaJogador;

@Repository
public interface UsuarioFichaJogadorRepository extends JpaRepository<UsuarioFichaJogador, Long> {

//	Page<UsuarioFichaJogador> findByFilter(Long idNe, Long idEq, Usuario usuarioEq, FichaJogador fichaJogadorEq,
//			Pageable pageRequest);

}
