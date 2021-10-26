package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Caracteristica;
import com.rafdev.fpdd.repositories.CaracteristicaRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class CaracteristicaService extends AbstractCommonService<Caracteristica, Long> {

	private CaracteristicaRepository repository;

	@Autowired
	CaracteristicaService(CaracteristicaRepository repository) {
		this.repository = repository;
	}

	@Override
	public CaracteristicaRepository getRepository() {
		return repository;
	}

//	public Page<Caracteristica> findByFilter(CaracteristicaFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(),
//				filter.getAntecedenteEquals() == null ? null : filter.getAntecedenteEquals().getId(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
