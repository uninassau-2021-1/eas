package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Ideal;
import com.rafdev.fpdd.repositories.IdealRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class IdealService extends AbstractCommonService<Ideal, Long> {

	private IdealRepository repository;

	@Autowired
	IdealService(IdealRepository repository) {
		this.repository = repository;
	}

	@Override
	public IdealRepository getRepository() {
		return repository;
	}

//	public Page<Ideal> findByFilter(IdealFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(),
//				filter.getAntecedenteEquals() == null ? null : filter.getAntecedenteEquals().getId(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
