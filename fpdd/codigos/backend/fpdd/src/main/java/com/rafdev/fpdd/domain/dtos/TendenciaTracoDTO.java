package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaTraco;
import com.rafdev.fpdd.domain.entities.Traco;

public class TendenciaTracoDTO extends AbstractBackingDTO<TendenciaTraco, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Tendencia tendencia;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Traco traco;

	public TendenciaTracoDTO() {
		super();
	}

	public TendenciaTracoDTO(Long id, Tendencia tendencia, Traco traco) {
		super();
		this.id = id;
		this.tendencia = tendencia;
		this.traco = traco;
	}

	public TendenciaTracoDTO(TendenciaTraco obj) {
		super();
		this.id = obj.getId();
		this.tendencia = obj.getTendencia();
		this.traco = obj.getTraco();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tendencia getTendencia() {
		return tendencia;
	}

	public void setTendencia(@Valid Tendencia tendencia) {
		this.tendencia = tendencia;
	}

	public Traco getTraco() {
		return traco;
	}

	public void setTraco(@Valid Traco traco) {
		this.traco = traco;
	}

	public TendenciaTraco toEntity() {
		return new TendenciaTraco(this);
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
		TendenciaTracoDTO other = (TendenciaTracoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TendenciaTracoDTO [id=" + id + ", tendencia=" + tendencia + ", traco=" + traco + "]";
	}

}
