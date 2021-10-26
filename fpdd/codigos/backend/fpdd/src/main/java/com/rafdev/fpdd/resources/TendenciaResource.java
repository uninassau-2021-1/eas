package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.dtos.TendenciaDTO;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.filters.TendenciaFilter;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.TendenciaService;

@RestController
@RequestMapping(value = PageConfig.PAGE_TENDENCIA)
public class TendenciaResource extends AbstractCommonResource<Tendencia, Long> {

	@Autowired
	private TendenciaService service;

	@GetMapping(value = PageConfig.SEARCH)
	@ResponseBody
	public ResponseEntity<Page<TendenciaDTO>> findByFilter(TendenciaFilter filter) {
		Page<Tendencia> list = service.findByFilter(filter.getFilterDecoded());
		Page<TendenciaDTO> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@Override
	protected TendenciaService getService() {
		return service;
	}

}
