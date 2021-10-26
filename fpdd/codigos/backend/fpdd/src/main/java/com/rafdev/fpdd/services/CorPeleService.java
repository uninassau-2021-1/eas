package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.CorPele;
import com.rafdev.fpdd.domain.filters.CorPeleFilter;
import com.rafdev.fpdd.domain.filters.model.FilterConfig;
import com.rafdev.fpdd.repositories.CorPeleRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class CorPeleService extends AbstractCommonService<CorPele, Long> {

	private CorPeleRepository repository;

	@Autowired
	CorPeleService(CorPeleRepository repository) {
		this.repository = repository;
	}

	@Override
	public CorPeleRepository getRepository() {
		return repository;
	}

	public Page<CorPele> findByFilter(CorPeleFilter filter) {
		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
				filter.getNomePtBrLike(), filter.getNomeEsLike(),
				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
				FilterConfig.getPageRequest(filter));
	}

}
