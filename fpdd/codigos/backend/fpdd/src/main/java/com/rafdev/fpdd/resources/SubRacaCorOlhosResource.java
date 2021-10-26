package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.SubRacaCorOlhos;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.SubRacaCorOlhosService;

@RestController
@RequestMapping(value = PageConfig.PAGE_SUB_RACA_COR_OLHOS)
public class SubRacaCorOlhosResource extends AbstractCommonResource<SubRacaCorOlhos, Long> {

	@Autowired
	private SubRacaCorOlhosService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<SubRacaCorOlhosDTO>> findByFilter(SubRacaCorOlhosFilter filter) {
//		Page<SubRacaCorOlhos> list = service.findByFilter(filter.getFilterDecoded());
//		Page<SubRacaCorOlhosDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected SubRacaCorOlhosService getService() {
		return service;
	}

}
