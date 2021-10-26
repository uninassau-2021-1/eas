package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.TendenciaIdeal;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.TendenciaIdealService;

@RestController
@RequestMapping(value = PageConfig.PAGE_TENDENCIA_IDEAL)
public class TendenciaIdealResource extends AbstractCommonResource<TendenciaIdeal, Long> {

	@Autowired
	private TendenciaIdealService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<TendenciaIdealDTO>> findByFilter(TendenciaIdealFilter filter) {
//		Page<TendenciaIdeal> list = service.findByFilter(filter.getFilterDecoded());
//		Page<TendenciaIdealDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected TendenciaIdealService getService() {
		return service;
	}

}
