package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Vinculo;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.VinculoService;

@RestController
@RequestMapping(value = PageConfig.PAGE_VINCULO)
public class VinculoResource extends AbstractCommonResource<Vinculo, Long> {

	@Autowired
	private VinculoService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<VinculoDTO>> findByFilter(VinculoFilter filter) {
//		Page<Vinculo> list = service.findByFilter(filter.getFilterDecoded());
//		Page<VinculoDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected VinculoService getService() {
		return service;
	}

}
