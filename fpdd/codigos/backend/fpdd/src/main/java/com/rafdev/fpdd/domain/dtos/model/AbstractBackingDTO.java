package com.rafdev.fpdd.domain.dtos.model;

import java.io.Serializable;

import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;

public abstract class AbstractBackingDTO<T extends AbstractBackingEntity<K>, K> implements Serializable {
	private static final long serialVersionUID = 1L;

	public abstract K getId();

	public abstract void setId(K id);
	
	public abstract T toEntity();
	
}
