package com.rafdev.fpdd.services.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.domain.filters.model.IFilter;
import com.rafdev.fpdd.exceptions.ObjectNotFoundException;

@Service
public abstract class AbstractBackingService<T extends AbstractBackingEntity<K>, K, S extends JpaRepository<T, K>, U extends IFilter<T>> {

	public abstract S getRepository();

	public T findById(K id) {
		Optional<T> obj = getRepository().findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException());
	}

	public List<T> findAll() {
		return getRepository().findAll();
	}

	public Page<T> findByPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return getRepository().findAll(pageRequest);
	}

	public T insert(T dto) {
		dto.setUltimaAtualizacao(LocalDateTime.now());
		return getRepository().save(dto);
	}

	public T update(T dto) {
		dto.setUltimaAtualizacao(LocalDateTime.now());
		return getRepository().save(dto);
	}

	public void delete(K id) {
		try {
			getRepository().deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ObjectNotFoundException(e);
		}
	}

	public void delete(T obj) {
		try {
			getRepository().delete(obj);
		} catch (EmptyResultDataAccessException e) {
			throw new ObjectNotFoundException(e);
		}
	}

}
