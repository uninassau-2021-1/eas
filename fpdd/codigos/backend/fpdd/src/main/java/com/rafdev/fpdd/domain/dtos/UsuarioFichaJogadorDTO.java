package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.FichaJogador;
import com.rafdev.fpdd.domain.entities.Usuario;
import com.rafdev.fpdd.domain.entities.UsuarioFichaJogador;

public class UsuarioFichaJogadorDTO extends AbstractBackingDTO<UsuarioFichaJogador, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Usuario usuario;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private FichaJogador fichaJogador;

	public UsuarioFichaJogadorDTO() {
		super();
	}

	public UsuarioFichaJogadorDTO(Long id, Usuario usuario, FichaJogador fichaJogador) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fichaJogador = fichaJogador;
	}

	public UsuarioFichaJogadorDTO(UsuarioFichaJogador obj) {
		super();
		this.id = obj.getId();
		this.usuario = obj.getUsuario();
		this.fichaJogador = obj.getFichaJogador();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(@Valid Usuario usuario) {
		this.usuario = usuario;
	}

	public FichaJogador getFichaJogador() {
		return fichaJogador;
	}

	public void setFichaJogador(@Valid FichaJogador fichaJogador) {
		this.fichaJogador = fichaJogador;
	}

	public UsuarioFichaJogador toEntity() {
		return new UsuarioFichaJogador(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioFichaJogadorDTO other = (UsuarioFichaJogadorDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioFichaJogadorDTO [id=" + id + ", usuario=" + usuario + ", fichaJogador=" + fichaJogador + "]";
	}

}
