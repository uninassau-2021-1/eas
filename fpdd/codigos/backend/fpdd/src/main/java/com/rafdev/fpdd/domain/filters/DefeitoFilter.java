package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.Antecedente;
import com.rafdev.fpdd.domain.entities.Defeito;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;
import com.rafdev.fpdd.resources.utils.URLUtils;

public class DefeitoFilter extends AbstractBackingFilter<Defeito, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Antecedente antecedenteEquals;

	private String nomeEnLike;

	private String nomePtBrLike;

	private String nomeEsLike;

	private Character statusEquals;

	public DefeitoFilter() {
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

	public Antecedente getAntecedenteEquals() {
		return antecedenteEquals;
	}

	public void setAntecedenteEquals(@Valid Antecedente antecedenteEquals) {
		this.antecedenteEquals = antecedenteEquals;
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
		this.antecedenteEquals = null;
		this.nomeEnLike = null;
		this.nomePtBrLike = null;
		this.nomeEsLike = null;
		this.statusEquals = null;
	}

	@Override
	public DefeitoFilter getFilterDecoded() {
		DefeitoFilter filter = new DefeitoFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setAntecedenteEquals(getAntecedenteEquals());
		filter.setNomeEnLike(URLUtils.decodeParam(getNomeEnLike()));
		filter.setNomePtBrLike(URLUtils.decodeParam(getNomePtBrLike()));
		filter.setNomeEsLike(URLUtils.decodeParam(getNomeEsLike()));
		filter.setStatusEquals(getStatusEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.antecedenteEquals == null
				&& (this.nomeEnLike == null || this.nomeEnLike.isBlank())
				&& (this.nomePtBrLike == null || this.nomePtBrLike.isBlank())
				&& (this.nomeEsLike == null || this.nomeEsLike.isBlank()) && this.statusEquals == null;
	}

	@Override
	public String toString() {
		return "DefeitoFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", antecedenteEquals="
				+ antecedenteEquals + ", nomeEnLike=" + nomeEnLike + ", nomePtBrLike=" + nomePtBrLike + ", nomeEsLike="
				+ nomeEsLike + ", statusEquals=" + statusEquals + "]";
	}

}