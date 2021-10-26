package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.UsuarioFichaJogador;
import com.rafdev.fpdd.repositories.UsuarioFichaJogadorRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class UsuarioFichaJogadorService extends AbstractCommonService<UsuarioFichaJogador, Long> {

	private UsuarioFichaJogadorRepository repository;

	@Autowired
	UsuarioFichaJogadorService(UsuarioFichaJogadorRepository repository) {
		this.repository = repository;
	}

	@Override
	public UsuarioFichaJogadorRepository getRepository() {
		return repository;
	}

//	public Page<UsuarioFichaJogador> findByFilter(UsuarioFichaJogadorFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getUsuarioEquals(),
//				filter.getFichaJogadorEquals(), FilterConfig.getPageRequest(filter));
//	}

}
