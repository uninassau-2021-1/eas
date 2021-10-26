package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Antecedente;
import com.rafdev.fpdd.domain.filters.AntecedenteFilter;
import com.rafdev.fpdd.domain.filters.model.FilterConfig;
import com.rafdev.fpdd.repositories.AntecedenteRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class AntecedenteService extends AbstractCommonService<Antecedente, Long> {

	private AntecedenteRepository repository;

	@Autowired
	AntecedenteService(AntecedenteRepository repository) {
		this.repository = repository;
	}

	@Override
	public AntecedenteRepository getRepository() {
		return repository;
	}

	public Page<Antecedente> findByFilter(AntecedenteFilter filter) {
		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
				filter.getNomePtBrLike(), filter.getNomeEsLike(),
				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
				FilterConfig.getPageRequest(filter));
	}

}
