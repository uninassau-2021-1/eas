package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Defeito;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaDefeito;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class TendenciaDefeitoFilter extends AbstractBackingFilter<TendenciaDefeito, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Tendencia tendenciaEquals;

	@Valid
	private Defeito defeitoEquals;

	public TendenciaDefeitoFilter() {
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

	public Defeito getDefeitoEquals() {
		return defeitoEquals;
	}

	public void setDefeitoEquals(@Valid Defeito defeitoEquals) {
		this.defeitoEquals = defeitoEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.tendenciaEquals = null;
		this.defeitoEquals = null;
	}

	@Override
	public TendenciaDefeitoFilter getFilterDecoded() {
		TendenciaDefeitoFilter filter = new TendenciaDefeitoFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setTendenciaEquals(getTendenciaEquals());
		filter.setDefeitoEquals(getDefeitoEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.tendenciaEquals == null
				&& this.defeitoEquals == null;
	}

	@Override
	public String toString() {
		return "TendenciaDefeitoFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", tendenciaEquals="
				+ tendenciaEquals + ", defeitoEquals=" + defeitoEquals + "]";
	}

}
