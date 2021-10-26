package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Ideal;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.IdealService;

@RestController
@RequestMapping(value = PageConfig.PAGE_IDEAL)
public class IdealResource extends AbstractCommonResource<Ideal, Long> {

	@Autowired
	private IdealService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<IdealDTO>> findByFilter(IdealFilter filter) {
//		Page<Ideal> list = service.findByFilter(filter.getFilterDecoded());
//		Page<IdealDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected IdealService getService() {
		return service;
	}

}
