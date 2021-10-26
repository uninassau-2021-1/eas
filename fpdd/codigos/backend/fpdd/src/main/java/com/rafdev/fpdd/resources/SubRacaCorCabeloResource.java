package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.SubRacaCorCabelo;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.SubRacaCorCabeloService;

@RestController
@RequestMapping(value = PageConfig.PAGE_SUB_RACA_COR_CABELO)
public class SubRacaCorCabeloResource extends AbstractCommonResource<SubRacaCorCabelo, Long> {

	@Autowired
	private SubRacaCorCabeloService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<SubRacaCorCabeloDTO>> findByFilter(SubRacaCorCabeloFilter filter) {
//		Page<SubRacaCorCabelo> list = service.findByFilter(filter.getFilterDecoded());
//		Page<SubRacaCorCabeloDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected SubRacaCorCabeloService getService() {
		return service;
	}

}
