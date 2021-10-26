package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.TendenciaDefeito;
import com.rafdev.fpdd.repositories.TendenciaDefeitoRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class TendenciaDefeitoService extends AbstractCommonService<TendenciaDefeito, Long> {

	private TendenciaDefeitoRepository repository;

	@Autowired
	TendenciaDefeitoService(TendenciaDefeitoRepository repository) {
		this.repository = repository;
	}

	@Override
	public TendenciaDefeitoRepository getRepository() {
		return repository;
	}

//	public Page<TendenciaDefeito> findByFilter(TendenciaDefeitoFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getTendenciaEquals(),
//				filter.getDefeitoEquals(), FilterConfig.getPageRequest(filter));
//	}

}
