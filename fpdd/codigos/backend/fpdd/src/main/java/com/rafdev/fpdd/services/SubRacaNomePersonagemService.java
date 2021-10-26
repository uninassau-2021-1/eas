package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.SubRacaNomePersonagem;
import com.rafdev.fpdd.repositories.SubRacaNomePersonagemRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class SubRacaNomePersonagemService extends AbstractCommonService<SubRacaNomePersonagem, Long> {

	private SubRacaNomePersonagemRepository repository;

	@Autowired
	SubRacaNomePersonagemService(SubRacaNomePersonagemRepository repository) {
		this.repository = repository;
	}

	@Override
	public SubRacaNomePersonagemRepository getRepository() {
		return repository;
	}

//	public Page<SubRacaNomePersonagem> findByFilter(SubRacaNomePersonagemFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getSubRacaEquals(),
//				filter.getNomePersonagemEquals(), FilterConfig.getPageRequest(filter));
//	}

}
