package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.TendenciaVinculo;
import com.rafdev.fpdd.repositories.TendenciaVinculoRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class TendenciaVinculoService extends AbstractCommonService<TendenciaVinculo, Long> {

	private TendenciaVinculoRepository repository;

	@Autowired
	TendenciaVinculoService(TendenciaVinculoRepository repository) {
		this.repository = repository;
	}

	@Override
	public TendenciaVinculoRepository getRepository() {
		return repository;
	}

//	public Page<TendenciaVinculo> findByFilter(TendenciaVinculoFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getTendenciaEquals(),
//				filter.getVinculoEquals(), FilterConfig.getPageRequest(filter));
//	}

}
