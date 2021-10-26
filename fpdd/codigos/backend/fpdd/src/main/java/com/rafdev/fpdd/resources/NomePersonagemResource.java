package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.NomePersonagemDTO;
import com.rafdev.fpdd.domain.entities.NomePersonagem;
import com.rafdev.fpdd.domain.filters.NomePersonagemFilter;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.NomePersonagemService;

@RestController
@RequestMapping(value = PageConfig.PAGE_NOME_PERSONAGEM)
public class NomePersonagemResource extends AbstractCommonResource<NomePersonagem, Long> {

	@Autowired
	private NomePersonagemService service;

	@GetMapping(value = PageConfig.SEARCH)
	@ResponseBody
	public ResponseEntity<Page<NomePersonagemDTO>> findByFilter(NomePersonagemFilter filter) {
		Page<NomePersonagem> list = service.findByFilter(filter.getFilterDecoded());
		Page<NomePersonagemDTO> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@Override
	protected NomePersonagemService getService() {
		return service;
	}

}