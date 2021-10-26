package com.rafdev.fpdd.domain.filters;

import com.rafdev.fpdd.domain.entities.Raca;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;
import com.rafdev.fpdd.resources.utils.URLUtils;

public class RacaFilter extends AbstractBackingFilter<Raca, Long> {

	private Long idEquals;

	private Long idNotEquals;

	private String nomeEnLike;

	private String nomePtBrLike;

	private String nomeEsLike;

	private Short alturaMaxEquals;

	private Short alturaMinEquals;

	private Float pesoMaxEquals;

	private Float pesoMinEquals;

	private Short idadeMaxEquals;

	private Short idadeMinEquals;

	private Character statusEquals;

	public RacaFilter() {
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

	public Short getAlturaMaxEquals() {
		return alturaMaxEquals;
	}

	public void setAlturaMaxEquals(Short alturaMaxEquals) {
		this.alturaMaxEquals = alturaMaxEquals;
	}

	public Short getAlturaMinEquals() {
		return alturaMinEquals;
	}

	public void setAlturaMinEquals(Short alturaMinEquals) {
		this.alturaMinEquals = alturaMinEquals;
	}

	public Float getPesoMaxEquals() {
		return pesoMaxEquals;
	}

	public void setPesoMaxEquals(Float pesoMaxEquals) {
		this.pesoMaxEquals = pesoMaxEquals;
	}

	public Float getPesoMinEquals() {
		return pesoMinEquals;
	}

	public void setPesoMinEquals(Float pesoMinEquals) {
		this.pesoMinEquals = pesoMinEquals;
	}

	public Short getIdadeMaxEquals() {
		return idadeMaxEquals;
	}

	public void setIdadeMaxEquals(Short idadeMaxEquals) {
		this.idadeMaxEquals = idadeMaxEquals;
	}

	public Short getIdadeMinEquals() {
		return idadeMinEquals;
	}

	public void setIdadeMinEquals(Short idadeMinEquals) {
		this.idadeMinEquals = idadeMinEquals;
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
		this.nomeEnLike = null;
		this.nomePtBrLike = null;
		this.nomeEsLike = null;
		this.alturaMaxEquals = null;
		this.alturaMinEquals = null;
		this.pesoMaxEquals = null;
		this.pesoMinEquals = null;
		this.idadeMaxEquals = null;
		this.idadeMinEquals = null;
		this.statusEquals = null;
	}

	@Override
	public RacaFilter getFilterDecoded() {
		RacaFilter filter = new RacaFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setNomeEnLike(URLUtils.decodeParam(getNomeEnLike()));
		filter.setNomePtBrLike(URLUtils.decodeParam(getNomePtBrLike()));
		filter.setNomeEsLike(URLUtils.decodeParam(getNomeEsLike()));
		filter.setAlturaMaxEquals(getAlturaMaxEquals());
		filter.setAlturaMinEquals(getAlturaMinEquals());
		filter.setPesoMaxEquals(getPesoMaxEquals());
		filter.setPesoMinEquals(getPesoMinEquals());
		filter.setIdadeMaxEquals(getIdadeMaxEquals());
		filter.setIdadeMinEquals(getIdadeMinEquals());
		filter.setStatusEquals(getStatusEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null
				&& (this.nomeEnLike == null || this.nomeEnLike.isBlank())
				&& (this.nomePtBrLike == null || this.nomePtBrLike.isBlank())
				&& (this.nomeEsLike == null || this.nomeEsLike.isBlank()) && this.alturaMaxEquals == null
				&& this.alturaMinEquals == null && this.pesoMaxEquals == null && this.pesoMinEquals == null
				&& this.idadeMaxEquals == null && this.idadeMinEquals == null && this.statusEquals == null;
	}

	@Override
	public String toString() {
		return "RacaFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", nomeEnLike=" + nomeEnLike
				+ ", nomePtBrLike=" + nomePtBrLike + ", nomeEsLike=" + nomeEsLike + ", alturaMaxEquals="
				+ alturaMaxEquals + ", alturaMinEquals=" + alturaMinEquals + ", pesoMaxEquals=" + pesoMaxEquals
				+ ", pesoMinEquals=" + pesoMinEquals + ", idadeMaxEquals=" + idadeMaxEquals + ", idadeMinEquals="
				+ idadeMinEquals + ", statusEquals=" + statusEquals + "]";
	}

}
