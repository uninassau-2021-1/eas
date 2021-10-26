package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.UsuarioFichaJogador;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.UsuarioFichaJogadorService;

@RestController
@RequestMapping(value = PageConfig.PAGE_USUARIO_FICHA_JOGADOR)
public class UsuarioFichaJogadorResource extends AbstractCommonResource<UsuarioFichaJogador, Long> {

	@Autowired
	private UsuarioFichaJogadorService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<UsuarioFichaJogadorDTO>> findByFilter(UsuarioFichaJogadorFilter filter) {
//		Page<UsuarioFichaJogador> list = service.findByFilter(filter.getFilterDecoded());
//		Page<UsuarioFichaJogadorDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected UsuarioFichaJogadorService getService() {
		return service;
	}

}
