package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaTraco;
import com.rafdev.fpdd.domain.entities.Traco;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class TendenciaTracoFilter extends AbstractBackingFilter<TendenciaTraco, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Tendencia tendenciaEquals;

	@Valid
	private Traco tracoEquals;

	public TendenciaTracoFilter() {
		super();
	}

	public Long getIdEquals() {
		return idEquals;
	}

	public void setIdEquals(Long idEquals) {
		this.idEquals = idEquals;
	}

	public Long getIdNotEquals() {
		return idNotEquals;
	}

	public void setIdNotEquals(Long idNotEquals) {
		this.idNotEquals = idNotEquals;
	}

	public Tendencia getTendenciaEquals() {
		return tendenciaEquals;
	}

	public void setTendenciaEquals(@Valid Tendencia tendenciaEquals) {
		this.tendenciaEquals = tendenciaEquals;
	}

	public Traco getTracoEquals() {
		return tracoEquals;
	}

	public void setTracoEquals(@Valid Traco tracoEquals) {
		this.tracoEquals = tracoEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.tendenciaEquals = null;
		this.tracoEquals = null;
	}

	@Override
	public TendenciaTracoFilter getFilterDecoded() {
		TendenciaTracoFilter filter = new TendenciaTracoFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setTendenciaEquals(getTendenciaEquals());
		filter.setTracoEquals(getTracoEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.tendenciaEquals == null
				&& this.tracoEquals == null;
	}

	@Override
	public String toString() {
		return "TendenciaTracoFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", tendenciaEquals="
				+ tendenciaEquals + ", tracoEquals=" + tracoEquals + "]";
	}

}
