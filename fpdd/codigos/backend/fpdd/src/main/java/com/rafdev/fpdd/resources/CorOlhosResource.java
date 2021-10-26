package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.CorOlhosDTO;
import com.rafdev.fpdd.domain.entities.CorOlhos;
import com.rafdev.fpdd.domain.filters.CorOlhosFilter;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.CorOlhosService;

@RestController
@RequestMapping(value = PageConfig.PAGE_COR_OLHOS)
public class CorOlhosResource extends AbstractCommonResource<CorOlhos, Long> {

	@Autowired
	private CorOlhosService service;

	@GetMapping(value = PageConfig.SEARCH)
	@ResponseBody
	public ResponseEntity<Page<CorOlhosDTO>> findByFilter(CorOlhosFilter filter) {
		Page<CorOlhos> list = service.findByFilter(filter.getFilterDecoded());
		Page<CorOlhosDTO> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@Override
	protected CorOlhosService getService() {
		return service;
	}

}
