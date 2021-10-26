package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Defeito;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.DefeitoService;

@RestController
@RequestMapping(value = PageConfig.PAGE_DEFEITO)
public class DefeitoResource extends AbstractCommonResource<Defeito, Long> {

	@Autowired
	private DefeitoService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<DefeitoDTO>> findByFilter(DefeitoFilter filter) {
//		Page<Defeito> list = service.findByFilter(filter.getFilterDecoded());
//		Page<DefeitoDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected DefeitoService getService() {
		return service;
	}

}
