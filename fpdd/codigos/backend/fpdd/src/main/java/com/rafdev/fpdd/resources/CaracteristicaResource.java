package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Caracteristica;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.CaracteristicaService;

@RestController
@RequestMapping(value = PageConfig.PAGE_CARACTERISTICA)
public class CaracteristicaResource extends AbstractCommonResource<Caracteristica, Long> {

	@Autowired
	private CaracteristicaService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<CaracteristicaDTO>> findByFilter(CaracteristicaFilter filter) {
//		Page<Caracteristica> list = service.findByFilter(filter.getFilterDecoded());
//		Page<CaracteristicaDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected CaracteristicaService getService() {
		return service;
	}

}
