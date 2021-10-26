package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Vinculo;
import com.rafdev.fpdd.repositories.VinculoRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class VinculoService extends AbstractCommonService<Vinculo, Long> {

	private VinculoRepository repository;

	@Autowired
	VinculoService(VinculoRepository repository) {
		this.repository = repository;
	}

	@Override
	public VinculoRepository getRepository() {
		return repository;
	}

//	public Page<Vinculo> findByFilter(VinculoFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(),
//				filter.getAntecedenteEquals() == null ? null : filter.getAntecedenteEquals().getId(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
