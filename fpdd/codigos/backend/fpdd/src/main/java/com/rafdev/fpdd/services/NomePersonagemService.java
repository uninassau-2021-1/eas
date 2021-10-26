package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.NomePersonagem;
import com.rafdev.fpdd.domain.filters.NomePersonagemFilter;
import com.rafdev.fpdd.domain.filters.model.FilterConfig;
import com.rafdev.fpdd.repositories.NomePersonagemRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class NomePersonagemService extends AbstractCommonService<NomePersonagem, Long> {

	private NomePersonagemRepository repository;

	@Autowired
	NomePersonagemService(NomePersonagemRepository repository) {
		this.repository = repository;
	}

	@Override
	public NomePersonagemRepository getRepository() {
		return repository;
	}

	public Page<NomePersonagem> findByFilter(NomePersonagemFilter filter) {
		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
				filter.getNomePtBrLike(), filter.getNomeEsLike(),
				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
				FilterConfig.getPageRequest(filter));
	}

}
