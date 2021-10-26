package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.CorCabelo;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaCorCabelo;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class SubRacaCorCabeloFilter extends AbstractBackingFilter<SubRacaCorCabelo, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private SubRaca subRacaEquals;

	@Valid
	private CorCabelo corCabeloEquals;

	public SubRacaCorCabeloFilter() {
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

	public CorCabelo getCorCabeloEquals() {
		return corCabeloEquals;
	}

	public void setCorCabeloEquals(@Valid CorCabelo corCabeloEquals) {
		this.corCabeloEquals = corCabeloEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.subRacaEquals = null;
		this.corCabeloEquals = null;
	}

	@Override
	public SubRacaCorCabeloFilter getFilterDecoded() {
		SubRacaCorCabeloFilter filter = new SubRacaCorCabeloFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setSubRacaEquals(getSubRacaEquals());
		filter.setCorCabeloEquals(getCorCabeloEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.subRacaEquals == null
				&& this.corCabeloEquals == null;
	}

	@Override
	public String toString() {
		return "SubRacaCorCabeloFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", subRacaEquals="
				+ subRacaEquals + ", corCabeloEquals=" + corCabeloEquals + "]";
	}

}
