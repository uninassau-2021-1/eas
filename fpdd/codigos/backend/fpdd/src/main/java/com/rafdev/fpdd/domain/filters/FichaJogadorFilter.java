package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Antecedente;
import com.rafdev.fpdd.domain.entities.Classe;
import com.rafdev.fpdd.domain.entities.FichaJogador;
import com.rafdev.fpdd.domain.entities.Raca;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;
import com.rafdev.fpdd.resources.utils.URLUtils;

public class FichaJogadorFilter extends AbstractBackingFilter<FichaJogador, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Classe classeEquals;

	@Valid
	private Raca racaEquals;

	@Valid
	private Antecedente antecedenteEquals;

	private String nomeLike;

	public FichaJogadorFilter() {
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

	public Classe getClasseEquals() {
		return classeEquals;
	}

	public void setClasseEquals(@Valid Classe classeEquals) {
		this.classeEquals = classeEquals;
	}

	public Raca getRacaEquals() {
		return racaEquals;
	}

	public void setRacaEquals(@Valid Raca racaEquals) {
		this.racaEquals = racaEquals;
	}

	public Antecedente getAntecedenteEquals() {
		return antecedenteEquals;
	}

	public void setAntecedenteEquals(@Valid Antecedente antecedenteEquals) {
		this.antecedenteEquals = antecedenteEquals;
	}

	public String getNomeLike() {
		return nomeLike;
	}

	public void setNomeLike(String nomeLike) {
		this.nomeLike = nomeLike;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.classeEquals = null;
		this.racaEquals = null;
		this.antecedenteEquals = null;
		this.nomeLike = null;
	}

	@Override
	public FichaJogadorFilter getFilterDecoded() {
		FichaJogadorFilter filter = new FichaJogadorFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setClasseEquals(getClasseEquals());
		filter.setRacaEquals(getRacaEquals());
		filter.setAntecedenteEquals(getAntecedenteEquals());
		filter.setNomeLike(URLUtils.decodeParam(getNomeLike()));

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.classeEquals == null && this.racaEquals == null
				&& this.antecedenteEquals == null && (this.nomeLike == null || this.nomeLike.isBlank());
	}

	@Override
	public String toString() {
		return "FichaJogadorFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", classeEquals="
				+ classeEquals + ", racaEquals=" + racaEquals + ", antecedenteEquals=" + antecedenteEquals
				+ ", nomeLike=" + nomeLike + "]";
	}

}
