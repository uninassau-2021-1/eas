package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.SubRacaCorOlhos;
import com.rafdev.fpdd.repositories.SubRacaCorOlhosRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class SubRacaCorOlhosService extends AbstractCommonService<SubRacaCorOlhos, Long> {

	private SubRacaCorOlhosRepository repository;

	@Autowired
	SubRacaCorOlhosService(SubRacaCorOlhosRepository repository) {
		this.repository = repository;
	}

	@Override
	public SubRacaCorOlhosRepository getRepository() {
		return repository;
	}

//	public Page<SubRacaCorOlhos> findByFilter(SubRacaCorOlhosFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getSubRacaEquals(),
//				filter.getCorOlhosEquals(), FilterConfig.getPageRequest(filter));
//	}

}
