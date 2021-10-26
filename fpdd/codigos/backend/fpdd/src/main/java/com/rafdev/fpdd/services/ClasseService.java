package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Classe;
import com.rafdev.fpdd.repositories.ClasseRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class ClasseService extends AbstractCommonService<Classe, Long> {

	private ClasseRepository repository;

	@Autowired
	ClasseService(ClasseRepository repository) {
		this.repository = repository;
	}

	@Override
	public ClasseRepository getRepository() {
		return repository;
	}

//	public Page<Classe> findByFilter(ClasseFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getNomeEnLike(),
//				filter.getNomePtBrLike(), filter.getNomeEsLike(),
//				filter.getStatusEquals() == null ? null : filter.getStatusEquals().getCodigo(),
//				FilterConfig.getPageRequest(filter));
//	}

}
