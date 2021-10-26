package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.CorPeleDTO;
import com.rafdev.fpdd.domain.entities.CorPele;
import com.rafdev.fpdd.domain.filters.CorPeleFilter;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.CorPeleService;

@RestController
@RequestMapping(value = PageConfig.PAGE_COR_PELE)
public class CorPeleResource extends AbstractCommonResource<CorPele, Long> {

	@Autowired
	private CorPeleService service;

	@GetMapping(value = PageConfig.SEARCH)
	@ResponseBody
	public ResponseEntity<Page<CorPeleDTO>> findByFilter(CorPeleFilter filter) {
		Page<CorPele> list = service.findByFilter(filter.getFilterDecoded());
		Page<CorPeleDTO> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@Override
	protected CorPeleService getService() {
		return service;
	}

}
