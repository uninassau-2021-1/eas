package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.CorCabeloDTO;
import com.rafdev.fpdd.domain.entities.CorCabelo;
import com.rafdev.fpdd.domain.filters.CorCabeloFilter;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.CorCabeloService;

@RestController
@RequestMapping(value = PageConfig.PAGE_COR_CABELO)
public class CorCabeloResource extends AbstractCommonResource<CorCabelo, Long> {

	@Autowired
	private CorCabeloService service;

	@GetMapping(value = PageConfig.SEARCH)
	@ResponseBody
	public ResponseEntity<Page<CorCabeloDTO>> findByFilter(CorCabeloFilter filter) {
		Page<CorCabelo> list = service.findByFilter(filter.getFilterDecoded());
		Page<CorCabeloDTO> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@Override
	protected CorCabeloService getService() {
		return service;
	}

}
