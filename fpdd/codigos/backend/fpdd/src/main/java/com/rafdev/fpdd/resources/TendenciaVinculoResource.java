package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.TendenciaVinculo;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.TendenciaVinculoService;

@RestController
@RequestMapping(value = PageConfig.PAGE_TENDENCIA_VINCULO)
public class TendenciaVinculoResource extends AbstractCommonResource<TendenciaVinculo, Long> {

	@Autowired
	private TendenciaVinculoService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<TendenciaVinculoDTO>> findByFilter(TendenciaVinculoFilter filter) {
//		Page<TendenciaVinculo> list = service.findByFilter(filter.getFilterDecoded());
//		Page<TendenciaVinculoDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected TendenciaVinculoService getService() {
		return service;
	}

}
