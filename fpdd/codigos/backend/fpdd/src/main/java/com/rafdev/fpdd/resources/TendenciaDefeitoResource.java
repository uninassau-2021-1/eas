package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.TendenciaDefeito;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.TendenciaDefeitoService;

@RestController
@RequestMapping(value = PageConfig.PAGE_TENDENCIA_DEFEITO)
public class TendenciaDefeitoResource extends AbstractCommonResource<TendenciaDefeito, Long> {

	@Autowired
	private TendenciaDefeitoService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<TendenciaDefeitoDTO>> findByFilter(TendenciaDefeitoFilter filter) {
//		Page<TendenciaDefeito> list = service.findByFilter(filter.getFilterDecoded());
//		Page<TendenciaDefeitoDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected TendenciaDefeitoService getService() {
		return service;
	}

}
