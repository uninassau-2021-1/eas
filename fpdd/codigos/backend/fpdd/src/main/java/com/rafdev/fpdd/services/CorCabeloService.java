package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.CorCabelo;
import com.rafdev.fpdd.domain.filters.CorCabeloFilter;
import com.rafdev.fpdd.domain.filters.model.FilterConfig;
import com.rafdev.fpdd.repositories.CorCabeloRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class CorCabeloService extends AbstractCommonService<CorCabelo, Long> {

	private CorCabeloRepository repository;

	@Autowired
	CorCabeloService(CorCabeloRepository repository) {
		this.repository = repository;
	}

	@Override
	public CorCabeloRepository getRepository() {
		return repository;
	}

	public Page<CorCabelo> findByFilter(CorCabeloFilter filter) {
		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
				filter.getNomePtBrLike(), filter.getNomeEsLike(),
				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
				FilterConfig.getPageRequest(filter));
	}

}
