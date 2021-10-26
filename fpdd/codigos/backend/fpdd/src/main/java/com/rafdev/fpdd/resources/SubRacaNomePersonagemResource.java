package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.SubRacaNomePersonagem;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.SubRacaNomePersonagemService;

@RestController
@RequestMapping(value = PageConfig.PAGE_SUB_RACA_NOME_PERSONAGEM)
public class SubRacaNomePersonagemResource extends AbstractCommonResource<SubRacaNomePersonagem, Long> {

	@Autowired
	private SubRacaNomePersonagemService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<SubRacaNomePersonagemDTO>> findByFilter(SubRacaNomePersonagemFilter filter) {
//		Page<SubRacaNomePersonagem> list = service.findByFilter(filter.getFilterDecoded());
//		Page<SubRacaNomePersonagemDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected SubRacaNomePersonagemService getService() {
		return service;
	}

}
