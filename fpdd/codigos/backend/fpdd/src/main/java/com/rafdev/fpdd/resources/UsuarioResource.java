package com.rafdev.fpdd.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafdev.fpdd.domain.entities.Usuario;
import com.rafdev.fpdd.resources.model.AbstractCommonResource;
import com.rafdev.fpdd.resources.model.PageConfig;
import com.rafdev.fpdd.services.UsuarioService;

@RestController
@RequestMapping(value = PageConfig.PAGE_USUARIO)
public class UsuarioResource extends AbstractCommonResource<Usuario, Long> {

	@Autowired
	private UsuarioService service;

//	@GetMapping(value = PageConfig.SEARCH)
//	@ResponseBody
//	public ResponseEntity<Page<UsuarioDTO>> findByFilter(UsuarioFilter filter) {
//		Page<Usuario> list = service.findByFilter(filter.getFilterDecoded());
//		Page<UsuarioDTO> listDto = list.map(obj -> obj.toDto());
//		return ResponseEntity.ok().body(listDto);
//	}

	@Override
	protected UsuarioService getService() {
		return service;
	}

}
