package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Defeito;
import com.rafdev.fpdd.repositories.DefeitoRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class DefeitoService extends AbstractCommonService<Defeito, Long> {

	private DefeitoRepository repository;

	@Autowired
	DefeitoService(DefeitoRepository repository) {
		this.repository = repository;
	}

	@Override
	public DefeitoRepository getRepository() {
		return repository;
	}

//	public Page<Defeito> findByFilter(DefeitoFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(),
//				filter.getAntecedenteEquals() == null ? null : filter.getAntecedenteEquals().getId(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
