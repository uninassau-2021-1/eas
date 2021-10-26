package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.TendenciaTraco;
import com.rafdev.fpdd.repositories.TendenciaTracoRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class TendenciaTracoService extends AbstractCommonService<TendenciaTraco, Long> {

	private TendenciaTracoRepository repository;

	@Autowired
	TendenciaTracoService(TendenciaTracoRepository repository) {
		this.repository = repository;
	}

	@Override
	public TendenciaTracoRepository getRepository() {
		return repository;
	}

//	public Page<TendenciaTraco> findByFilter(TendenciaTracoFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getTendenciaEquals(),
//				filter.getTracoEquals(), FilterConfig.getPageRequest(filter));
//	}

}
