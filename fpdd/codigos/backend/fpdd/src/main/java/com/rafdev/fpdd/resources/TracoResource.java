package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Traco;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.TracoService;

@RestController
@RequestMapping(value = PageConfig.PAGE_TRACO)
public class TracoResource extends AbstractCommonResource<Traco, Long> {

	@Autowired
	private TracoService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<TracoDTO>> findByFilter(TracoFilter filter) {
//		Page<Traco> list = service.findByFilter(filter.getFilterDecoded());
//		Page<TracoDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected TracoService getService() {
		return service;
	}

}
