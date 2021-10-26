package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Classe;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.ClasseService;

@RestController
@RequestMapping(value = PageConfig.PAGE_CLASSE)
public class ClasseResource extends AbstractCommonResource<Classe, Long> {

	@Autowired
	private ClasseService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<ClasseDTO>> findByFilter(ClasseFilter filter) {
//		Page<Classe> list = service.findByFilter(filter.getFilterDecoded());
//		Page<ClasseDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected ClasseService getService() {
		return service;
	}

}
