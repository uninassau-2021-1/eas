package com.rafdev.fpdd.domain.entities.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;

public abstract class AbstractBackingEntity<K> implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String SCHEMA_FPDD_NAME = "FPDD";

	public abstract K getId();

	public abstract void setId(K id);

	public abstract LocalDateTime getUltimaAtualizacao();

	public abstract void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao);

	public abstract <U extends AbstractBackingDTO<? extends AbstractBackingEntity<K>, K>> U toDto();

}
