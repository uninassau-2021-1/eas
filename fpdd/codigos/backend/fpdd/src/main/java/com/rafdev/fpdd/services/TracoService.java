package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Traco;
import com.rafdev.fpdd.repositories.TracoRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class TracoService extends AbstractCommonService<Traco, Long> {

	private TracoRepository repository;

	@Autowired
	TracoService(TracoRepository repository) {
		this.repository = repository;
	}

	@Override
	public TracoRepository getRepository() {
		return repository;
	}

//	public Page<Traco> findByFilter(TracoFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(),
//				filter.getAntecedenteEquals() == null ? null : filter.getAntecedenteEquals().getId(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
