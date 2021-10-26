package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.CorPele;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaCorPele;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class SubRacaCorPeleFilter extends AbstractBackingFilter<SubRacaCorPele, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private SubRaca subRacaEquals;

	@Valid
	private CorPele corPeleEquals;

	public SubRacaCorPeleFilter() {
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

	public SubRaca getSubRacaEquals() {
		return subRacaEquals;
	}

	public void setSubRacaEquals(@Valid SubRaca subRacaEquals) {
		this.subRacaEquals = subRacaEquals;
	}

	public CorPele getCorPeleEquals() {
		return corPeleEquals;
	}

	public void setCorPeleEquals(@Valid CorPele corPeleEquals) {
		this.corPeleEquals = corPeleEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.subRacaEquals = null;
		this.corPeleEquals = null;
	}

	@Override
	public SubRacaCorPeleFilter getFilterDecoded() {
		SubRacaCorPeleFilter filter = new SubRacaCorPeleFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setSubRacaEquals(getSubRacaEquals());
		filter.setCorPeleEquals(getCorPeleEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.subRacaEquals == null
				&& this.corPeleEquals == null;
	}

	@Override
	public String toString() {
		return "SubRacaCorPeleFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", subRacaEquals="
				+ subRacaEquals + ", corPeleEquals=" + corPeleEquals + "]";
	}

}
