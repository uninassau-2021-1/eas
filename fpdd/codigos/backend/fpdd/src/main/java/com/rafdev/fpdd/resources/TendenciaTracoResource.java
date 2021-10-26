package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.TendenciaTraco;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.TendenciaTracoService;

@RestController
@RequestMapping(value = PageConfig.PAGE_TENDENCIA_TRACO)
public class TendenciaTracoResource extends AbstractCommonResource<TendenciaTraco, Long> {

	@Autowired
	private TendenciaTracoService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<TendenciaTracoDTO>> findByFilter(TendenciaTracoFilter filter) {
//		Page<TendenciaTraco> list = service.findByFilter(filter.getFilterDecoded());
//		Page<TendenciaTracoDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected TendenciaTracoService getService() {
		return service;
	}

}
