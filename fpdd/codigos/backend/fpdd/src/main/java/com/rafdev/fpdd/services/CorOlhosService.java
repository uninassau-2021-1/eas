package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.CorOlhos;
import com.rafdev.fpdd.domain.filters.CorOlhosFilter;
import com.rafdev.fpdd.domain.filters.model.FilterConfig;
import com.rafdev.fpdd.repositories.CorOlhosRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class CorOlhosService extends AbstractCommonService<CorOlhos, Long> {

	private CorOlhosRepository repository;

	@Autowired
	CorOlhosService(CorOlhosRepository repository) {
		this.repository = repository;
	}

	@Override
	public CorOlhosRepository getRepository() {
		return repository;
	}

	public Page<CorOlhos> findByFilter(CorOlhosFilter filter) {
		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
				filter.getNomePtBrLike(), filter.getNomeEsLike(),
				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
				FilterConfig.getPageRequest(filter));
	}

}
