package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaVinculo;
import com.rafdev.fpdd.domain.entities.Vinculo;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class TendenciaVinculoFilter extends AbstractBackingFilter<TendenciaVinculo, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Tendencia tendenciaEquals;

	@Valid
	private Vinculo vinculoEquals;

	public TendenciaVinculoFilter() {
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

	public Vinculo getVinculoEquals() {
		return vinculoEquals;
	}

	public void setVinculoEquals(@Valid Vinculo vinculoEquals) {
		this.vinculoEquals = vinculoEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.tendenciaEquals = null;
		this.vinculoEquals = null;
	}

	@Override
	public TendenciaVinculoFilter getFilterDecoded() {
		TendenciaVinculoFilter filter = new TendenciaVinculoFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setTendenciaEquals(getTendenciaEquals());
		filter.setVinculoEquals(getVinculoEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.tendenciaEquals == null
				&& this.vinculoEquals == null;
	}

	@Override
	public String toString() {
		return "TendenciaVinculoFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", tendenciaEquals="
				+ tendenciaEquals + ", vinculoEquals=" + vinculoEquals + "]";
	}

}
