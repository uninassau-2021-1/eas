package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Classe;
import com.rafdev.fpdd.domain.entities.SubClasse;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;
import com.rafdev.fpdd.resources.utils.URLUtils;

public class SubClasseFilter extends AbstractBackingFilter<SubClasse, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Classe classeEquals;

	private String nomeEnLike;

	private String nomePtBrLike;

	private String nomeEsLike;

	private Character statusEquals;

	public SubClasseFilter() {
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

	public String getNomeEnLike() {
		return nomeEnLike;
	}

	public void setNomeEnLike(String nomeEnLike) {
		this.nomeEnLike = nomeEnLike;
	}

	public String getNomePtBrLike() {
		return nomePtBrLike;
	}

	public void setNomePtBrLike(String nomePtBrLike) {
		this.nomePtBrLike = nomePtBrLike;
	}

	public String getNomeEsLike() {
		return nomeEsLike;
	}

	public void setNomeEsLike(String nomeEsLike) {
		this.nomeEsLike = nomeEsLike;
	}

	public StatusEnum getStatusEquals() {
		return StatusEnum.toEnum(statusEquals);
	}

	public void setStatusEquals(StatusEnum statusEquals) {
		this.statusEquals = statusEquals == null ? null : statusEquals.getCodigo();
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.classeEquals = null;
		this.nomeEnLike = null;
		this.nomePtBrLike = null;
		this.nomeEsLike = null;
		this.statusEquals = null;
	}

	@Override
	public SubClasseFilter getFilterDecoded() {
		SubClasseFilter filter = new SubClasseFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setClasseEquals(getClasseEquals());
		filter.setNomeEnLike(URLUtils.decodeParam(getNomeEnLike()));
		filter.setNomePtBrLike(URLUtils.decodeParam(getNomePtBrLike()));
		filter.setNomeEsLike(URLUtils.decodeParam(getNomeEsLike()));
		filter.setStatusEquals(getStatusEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.classeEquals == null
				&& (this.nomeEnLike == null || this.nomeEnLike.isBlank())
				&& (this.nomePtBrLike == null || this.nomePtBrLike.isBlank())
				&& (this.nomeEsLike == null || this.nomeEsLike.isBlank()) && this.statusEquals == null;
	}

	@Override
	public String toString() {
		return "SubClasseFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", classeEquals="
				+ classeEquals + ", nomeEnLike=" + nomeEnLike + ", nomePtBrLike=" + nomePtBrLike + ", nomeEsLike="
				+ nomeEsLike + ", statusEquals=" + statusEquals + "]";
	}

}
