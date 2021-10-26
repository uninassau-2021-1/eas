package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Raca;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.RacaService;

@RestController
@RequestMapping(value = PageConfig.PAGE_RACA)
public class RacaResource extends AbstractCommonResource<Raca, Long> {

	@Autowired
	private RacaService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<RacaDTO>> findByFilter(RacaFilter filter) {
//		Page<Raca> list = service.findByFilter(filter.getFilterDecoded());
//		Page<RacaDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected RacaService getService() {
		return service;
	}

}
