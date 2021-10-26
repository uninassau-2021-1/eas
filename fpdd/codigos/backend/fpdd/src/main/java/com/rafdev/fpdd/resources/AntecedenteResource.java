package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.AntecedenteDTO;
import com.rafdev.fpdd.domain.entities.Antecedente;
import com.rafdev.fpdd.domain.filters.AntecedenteFilter;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.AntecedenteService;

@RestController
@RequestMapping(value = PageConfig.PAGE_ANTECEDENTE)
public class AntecedenteResource extends AbstractCommonResource<Antecedente, Long> {

	@Autowired
	private AntecedenteService service;

	@GetMapping(value = PageConfig.SEARCH)
	@ResponseBody
	public ResponseEntity<Page<AntecedenteDTO>> findByFilter(AntecedenteFilter filter) {
		Page<Antecedente> list = service.findByFilter(filter.getFilterDecoded());
		Page<AntecedenteDTO> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@Override
	protected AntecedenteService getService() {
		return service;
	}

}
