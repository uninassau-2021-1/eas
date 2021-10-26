package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.SubRacaCorPele;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.SubRacaCorPeleService;

@RestController
@RequestMapping(value = PageConfig.PAGE_SUB_RACA_COR_PELE)
public class SubRacaCorPeleResource extends AbstractCommonResource<SubRacaCorPele, Long> {

	@Autowired
	private SubRacaCorPeleService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<SubRacaCorPeleDTO>> findByFilter(SubRacaCorPeleFilter filter) {
//		Page<SubRacaCorPele> list = service.findByFilter(filter.getFilterDecoded());
//		Page<SubRacaCorPeleDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected SubRacaCorPeleService getService() {
		return service;
	}

}
