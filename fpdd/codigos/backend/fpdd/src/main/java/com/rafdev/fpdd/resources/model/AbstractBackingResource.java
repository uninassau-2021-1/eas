package com.rafdev.fpdd.resources.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.services.model.AbstractCommonService;

@RestController
public abstract class AbstractBackingResource<T extends AbstractBackingEntity<K>, K, U extends AbstractCommonService<T, K>, S extends AbstractBackingDTO<T, K>> {

	protected abstract U getService();

	@GetMapping(value = PageConfig.ID)
	public ResponseEntity<T> findById(@PathVariable K id) {
		T obj = getService().findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<S>> findAll() {
		List<T> list = getService().findAll();
		List<S> listDto = new ArrayList<>();

		for (T obj : list) {
			listDto.add(obj.toDto());
		}

		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping(value = PageConfig.PAGINATOR)
	public ResponseEntity<Page<S>> findByPage(@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nomePtBr") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
		Page<T> list = getService().findByPage(page, linesPerPage, orderBy, direction);
		Page<S> listDto = list.map(obj -> obj.toDto());
		return ResponseEntity.ok().body(listDto);
	}

	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody T obj) {
		T entity = getService().insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path(PageConfig.ID).buildAndExpand(entity.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value = PageConfig.ID)
	public ResponseEntity<Void> update(@Valid @RequestBody T obj, @PathVariable K id) {
		obj.setId(id);
		getService().update(obj);
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping(value = PageConfig.ID)
	public ResponseEntity<Void> delete(@PathVariable K id) {
		getService().delete(id);
		return ResponseEntity.noContent().build();
	}

	@DeleteMapping
	public ResponseEntity<Void> delete(T obj) {
		getService().delete(obj);
		return ResponseEntity.noContent().build();
	}

}
