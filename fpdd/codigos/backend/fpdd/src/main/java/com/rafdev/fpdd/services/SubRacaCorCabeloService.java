package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.SubRacaCorCabelo;
import com.rafdev.fpdd.repositories.SubRacaCorCabeloRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class SubRacaCorCabeloService extends AbstractCommonService<SubRacaCorCabelo, Long> {

	private SubRacaCorCabeloRepository repository;

	@Autowired
	SubRacaCorCabeloService(SubRacaCorCabeloRepository repository) {
		this.repository = repository;
	}

	@Override
	public SubRacaCorCabeloRepository getRepository() {
		return repository;
	}

//	public Page<SubRacaCorCabelo> findByFilter(SubRacaCorCabeloFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getSubRacaEquals(),
//				filter.getCorCabeloEquals(), FilterConfig.getPageRequest(filter));
//	}

}
