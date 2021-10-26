package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Ideal;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaIdeal;

public class TendenciaIdealDTO extends AbstractBackingDTO<TendenciaIdeal, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Tendencia tendencia;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Ideal ideal;

	public TendenciaIdealDTO() {
		super();
	}

	public TendenciaIdealDTO(Long id, Tendencia tendencia, Ideal ideal) {
		super();
		this.id = id;
		this.tendencia = tendencia;
		this.ideal = ideal;
	}

	public TendenciaIdealDTO(TendenciaIdeal obj) {
		super();
		this.id = obj.getId();
		this.tendencia = obj.getTendencia();
		this.ideal = obj.getIdeal();
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

	public Ideal getIdeal() {
		return ideal;
	}

	public void setIdeal(@Valid Ideal ideal) {
		this.ideal = ideal;
	}

	public TendenciaIdeal toEntity() {
		return new TendenciaIdeal(this);
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
		TendenciaIdealDTO other = (TendenciaIdealDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TendenciaIdealDTO [id=" + id + ", tendencia=" + tendencia + ", ideal=" + ideal + "]";
	}

}
