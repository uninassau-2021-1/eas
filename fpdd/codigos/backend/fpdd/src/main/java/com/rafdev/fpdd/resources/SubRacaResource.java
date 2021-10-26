package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.SubRacaService;

@RestController
@RequestMapping(value = PageConfig.PAGE_SUB_RACA)
public class SubRacaResource extends AbstractCommonResource<SubRaca, Long> {

	@Autowired
	private SubRacaService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<SubRacaDTO>> findByFilter(SubRacaFilter filter) {
//		Page<SubRaca> list = service.findByFilter(filter.getFilterDecoded());
//		Page<SubRacaDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected SubRacaService getService() {
		return service;
	}

}
