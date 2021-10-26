package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.repositories.SubRacaRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class SubRacaService extends AbstractCommonService<SubRaca, Long> {

	private SubRacaRepository repository;

	@Autowired
	SubRacaService(SubRacaRepository repository) {
		this.repository = repository;
	}

	@Override
	public SubRacaRepository getRepository() {
		return repository;
	}

//	public Page<SubRaca> findByFilter(SubRacaFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getRacaEquals(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
