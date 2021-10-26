package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.filters.TendenciaFilter;
import com.rafdev.fpdd.domain.filters.model.FilterConfig;
import com.rafdev.fpdd.repositories.TendenciaRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class TendenciaService extends AbstractCommonService<Tendencia, Long> {

	private TendenciaRepository repository;

	@Autowired
	TendenciaService(TendenciaRepository repository) {
		this.repository = repository;
	}

	@Override
	public TendenciaRepository getRepository() {
		return repository;
	}

	public Page<Tendencia> findByFilter(TendenciaFilter filter) {
		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
				filter.getNomePtBrLike(), filter.getNomeEsLike(),
				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
				FilterConfig.getPageRequest(filter));
	}

}
