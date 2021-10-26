package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.SubClasse;
import com.rafdev.fpdd.repositories.SubClasseRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class SubClasseService extends AbstractCommonService<SubClasse, Long> {

	private SubClasseRepository repository;

	@Autowired
	SubClasseService(SubClasseRepository repository) {
		this.repository = repository;
	}

	@Override
	public SubClasseRepository getRepository() {
		return repository;
	}

//	public Page<SubClasse> findByFilter(SubClasseFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getClasseEquals(),
//				filter.getNomeEnLike(), filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
