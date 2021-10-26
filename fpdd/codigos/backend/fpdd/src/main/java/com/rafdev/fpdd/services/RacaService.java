package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Raca;
import com.rafdev.fpdd.repositories.RacaRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class RacaService extends AbstractCommonService<Raca, Long> {

	private RacaRepository repository;

	@Autowired
	RacaService(RacaRepository repository) {
		this.repository = repository;
	}

	@Override
	public RacaRepository getRepository() {
		return repository;
	}

//	public Page<Raca> findByFilter(RacaFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
//				filter.getNomePtBrLike(), filter.getNomeEsLike(), filter.getAlturaMaxEquals(),
//				filter.getAlturaMinEquals(), filter.getPesoMaxEquals(), filter.getPesoMinEquals(),
//				filter.getIdadeMaxEquals(), filter.getIdadeMinEquals(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
