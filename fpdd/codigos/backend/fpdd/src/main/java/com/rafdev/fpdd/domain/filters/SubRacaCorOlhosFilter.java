package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.CorOlhos;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaCorOlhos;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class SubRacaCorOlhosFilter extends AbstractBackingFilter<SubRacaCorOlhos, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private SubRaca subRacaEquals;

	@Valid
	private CorOlhos corOlhosEquals;

	public SubRacaCorOlhosFilter() {
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

	public CorOlhos getCorOlhosEquals() {
		return corOlhosEquals;
	}

	public void setCorOlhosEquals(@Valid CorOlhos corOlhosEquals) {
		this.corOlhosEquals = corOlhosEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.subRacaEquals = null;
		this.corOlhosEquals = null;
	}

	@Override
	public SubRacaCorOlhosFilter getFilterDecoded() {
		SubRacaCorOlhosFilter filter = new SubRacaCorOlhosFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setSubRacaEquals(getSubRacaEquals());
		filter.setCorOlhosEquals(getCorOlhosEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.subRacaEquals == null
				&& this.corOlhosEquals == null;
	}

	@Override
	public String toString() {
		return "SubRacaCorOlhosFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", subRacaEquals="
				+ subRacaEquals + ", corOlhosEquals=" + corOlhosEquals + "]";
	}

}
