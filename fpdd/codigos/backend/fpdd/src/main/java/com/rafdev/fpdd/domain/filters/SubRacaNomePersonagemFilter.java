package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.NomePersonagem;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaNomePersonagem;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class SubRacaNomePersonagemFilter extends AbstractBackingFilter<SubRacaNomePersonagem, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private SubRaca subRacaEquals;

	@Valid
	private NomePersonagem nomePersonagemEquals;

	public SubRacaNomePersonagemFilter() {
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

	public NomePersonagem getNomePersonagemEquals() {
		return nomePersonagemEquals;
	}

	public void setNomePersonagemEquals(@Valid NomePersonagem nomePersonagemEquals) {
		this.nomePersonagemEquals = nomePersonagemEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.subRacaEquals = null;
		this.nomePersonagemEquals = null;
	}

	@Override
	public SubRacaNomePersonagemFilter getFilterDecoded() {
		SubRacaNomePersonagemFilter filter = new SubRacaNomePersonagemFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setSubRacaEquals(getSubRacaEquals());
		filter.setNomePersonagemEquals(getNomePersonagemEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.subRacaEquals == null
				&& this.nomePersonagemEquals == null;
	}

	@Override
	public String toString() {
		return "SubRacaNomePersonagemFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", subRacaEquals="
				+ subRacaEquals + ", nomePersonagemEquals=" + nomePersonagemEquals + "]";
	}

}
