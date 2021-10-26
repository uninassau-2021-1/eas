package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.SubClasse;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.SubClasseService;

@RestController
@RequestMapping(value = PageConfig.PAGE_SUB_CLASSE)
public class SubClasseResource extends AbstractCommonResource<SubClasse, Long> {

	@Autowired
	private SubClasseService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<SubClasseDTO>> findByFilter(SubClasseFilter filter) {
//		Page<SubClasse> list = service.findByFilter(filter.getFilterDecoded());
//		Page<SubClasseDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected SubClasseService getService() {
		return service;
	}

}
