package com.rafdev.fpdd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafdev.fpdd.domain.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

//	Page<Usuario> findByFilter(Long idNe, Long idEq, String loginLike, String emailLike, String nomeLike,
//			String sobrenomeLike, String apelidoLike, LocalDate dataNascimentoEq, String paisEq, String enderecoLike,
//			String numeroEnderecoLike, String bairroLike, String cidadeLike, String estadoEq, String cepEq,
//			String idiomaEq, Character premiumEq, LocalDate dataInicioPremiumEq, LocalDate dataFimPremiumEq,
//			Character emailVerificadoEq, Character tipoUsuarioEq, LocalDate dataVerificacaoEmailEq,
//			LocalDate dataCadastroEq, Pageable pageRequest);

}
