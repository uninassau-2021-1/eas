package com.rafdev.fpdd.domain.filters;

import javax.validation.Valid;

import com.rafdev.fpdd.domain.entities.FichaJogador;
import com.rafdev.fpdd.domain.entities.Usuario;
import com.rafdev.fpdd.domain.entities.UsuarioFichaJogador;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;

public class UsuarioFichaJogadorFilter extends AbstractBackingFilter<UsuarioFichaJogador, Long> {

	private Long idEquals;

	private Long idNotEquals;

	@Valid
	private Usuario usuarioEquals;

	@Valid
	private FichaJogador fichaJogadorEquals;

	public UsuarioFichaJogadorFilter() {
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

	public Usuario getUsuarioEquals() {
		return usuarioEquals;
	}

	public void setUsuarioEquals(@Valid Usuario usuarioEquals) {
		this.usuarioEquals = usuarioEquals;
	}

	public FichaJogador getFichaJogadorEquals() {
		return fichaJogadorEquals;
	}

	public void setFichaJogadorEquals(@Valid FichaJogador fichaJogadorEquals) {
		this.fichaJogadorEquals = fichaJogadorEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.usuarioEquals = null;
		this.fichaJogadorEquals = null;
	}

	@Override
	public UsuarioFichaJogadorFilter getFilterDecoded() {
		UsuarioFichaJogadorFilter filter = new UsuarioFichaJogadorFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setUsuarioEquals(getUsuarioEquals());
		filter.setFichaJogadorEquals(getFichaJogadorEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && this.usuarioEquals == null
				&& this.fichaJogadorEquals == null;
	}

	@Override
	public String toString() {
		return "UsuarioFichaJogadorFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", usuarioEquals="
				+ usuarioEquals + ", fichaJogadorEquals=" + fichaJogadorEquals + "]";
	}

}
