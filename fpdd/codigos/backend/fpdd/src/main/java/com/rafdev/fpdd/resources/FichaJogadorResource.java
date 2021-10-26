package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.FichaJogador;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.FichaJogadorService;

@RestController
@RequestMapping(value = PageConfig.PAGE_FICHA_JOGADOR)
public class FichaJogadorResource extends AbstractCommonResource<FichaJogador, Long> {

	@Autowired
	private FichaJogadorService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<FichaJogadorDTO>> findByFilter(FichaJogadorFilter filter) {
//		Page<FichaJogador> list = service.findByFilter(filter.getFilterDecoded());
//		Page<FichaJogadorDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected FichaJogadorService getService() {
		return service;
	}

}
