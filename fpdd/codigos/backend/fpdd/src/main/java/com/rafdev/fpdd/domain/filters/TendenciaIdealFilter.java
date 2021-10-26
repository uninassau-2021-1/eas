package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Ideal;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaIdeal;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class TendenciaIdealFilter extends AbstractBackingFilter<TendenciaIdeal, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Tendencia tendenciaEquals;

	@Valid
	private Ideal idealEquals;

	public TendenciaIdealFilter() {
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

	public Ideal getIdealEquals() {
		return idealEquals;
	}

	public void setIdealEquals(@Valid Ideal idealEquals) {
		this.idealEquals = idealEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.tendenciaEquals = null;
		this.idealEquals = null;
	}

	@Override
	public TendenciaIdealFilter getFilterDecoded() {
		TendenciaIdealFilter filter = new TendenciaIdealFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setTendenciaEquals(getTendenciaEquals());
		filter.setIdealEquals(getIdealEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.tendenciaEquals == null
				&& this.idealEquals == null;
	}

	@Override
	public String toString() {
		return "TendenciaIdealFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", tendenciaEquals="
				+ tendenciaEquals + ", idealEquals=" + idealEquals + "]";
	}

}
