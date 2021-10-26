package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.TendenciaIdeal;
import com.rafdev.fpdd.repositories.TendenciaIdealRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class TendenciaIdealService extends AbstractCommonService<TendenciaIdeal, Long> {

	private TendenciaIdealRepository repository;

	@Autowired
	TendenciaIdealService(TendenciaIdealRepository repository) {
		this.repository = repository;
	}

	@Override
	public TendenciaIdealRepository getRepository() {
		return repository;
	}

//	public Page<TendenciaIdeal> findByFilter(TendenciaIdealFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getTendenciaEquals(),
//				filter.getIdealEquals(), FilterConfig.getPageRequest(filter));
//	}

}
