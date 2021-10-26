package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.SubRacaCorPele;
import com.rafdev.fpdd.repositories.SubRacaCorPeleRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class SubRacaCorPeleService extends AbstractCommonService<SubRacaCorPele, Long> {

	private SubRacaCorPeleRepository repository;

	@Autowired
	SubRacaCorPeleService(SubRacaCorPeleRepository repository) {
		this.repository = repository;
	}

	@Override
	public SubRacaCorPeleRepository getRepository() {
		return repository;
	}

//	public Page<SubRacaCorPele> findByFilter(SubRacaCorPeleFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getSubRacaEquals(),
//				filter.getCorPeleEquals(), FilterConfig.getPageRequest(filter));
//	}

}
