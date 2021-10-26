package com.rafdev.fpdd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.Usuario;
import com.rafdev.fpdd.repositories.UsuarioRepository;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@Service
public class UsuarioService extends AbstractCommonService<Usuario, Long> {

	private UsuarioRepository repository;

	@Autowired
	UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}

	@Override
	public UsuarioRepository getRepository() {
		return repository;
	}

//	public Page<Usuario> findByFilter(UsuarioFilter filter) {
//		return getRepository().findByFilter(filter.getIdNotEquals(), filter.getIdEquals(), filter.getLoginLike(),
//				filter.getEmailLike(), filter.getNomeLike(), filter.getSobrenomeLike(), filter.getApelidoLike(),
//				filter.getDataNascimentoEquals(), filter.getPaisEquals(), filter.getEnderecoLike(),
//				filter.getNumeroEnderecoLike(), filter.getBairroLike(), filter.getCidadeLike(),
//				filter.getEstadoEquals(), filter.getCepEquals(),
//				filter.getIdiomaEquals() == null ? null : filter.getIdiomaEquals().getCodigo(),
//				filter.getPremiumEquals() == null ? null : filter.getPremiumEquals().getCodigo(),
//				filter.getDataInicioPremiumEquals(), filter.getDataFimPremiumEquals(),
//				filter.getEmailVerificadoEquals() == null ? null : filter.getEmailVerificadoEquals().getCodigo(),
//				filter.getTipoUsuarioEquals() == null ? null : filter.getTipoUsuarioEquals().getCodigo(),
//				filter.getDataVerificacaoEmailEquals(), filter.getDataCadastroEquals(),
//				FilterConfig.getPageRequest(filter));
//	}

}
