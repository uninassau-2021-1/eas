package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.FichaJogador;
import com.rafdev.fpdd.repositories.FichaJogadorRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class FichaJogadorService extends AbstractCommonService<FichaJogador, Long> {

	private FichaJogadorRepository repository;

	@Autowired
	FichaJogadorService(FichaJogadorRepository repository) {
		this.repository = repository;
	}

	@Override
	public FichaJogadorRepository getRepository() {
		return repository;
	}

//	public Page<FichaJogador> findByFilter(FichaJogadorFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getClasseEquals(),
//				filter.getRacaEquals(), filter.getAntecedenteEquals(), filter.getNomeLike(),
//				FilterConfig.getPageRequest(filter));
//	}

}
