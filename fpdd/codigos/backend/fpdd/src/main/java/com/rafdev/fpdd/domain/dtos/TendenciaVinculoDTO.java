package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaVinculo;
import com.rafdev.fpdd.domain.entities.Vinculo;

public class TendenciaVinculoDTO extends AbstractBackingDTO<TendenciaVinculo, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Tendencia tendencia;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Vinculo vinculo;

	public TendenciaVinculoDTO() {
		super();
	}

	public TendenciaVinculoDTO(Long id, Tendencia tendencia, Vinculo vinculo) {
		super();
		this.id = id;
		this.tendencia = tendencia;
		this.vinculo = vinculo;
	}

	public TendenciaVinculoDTO(TendenciaVinculo obj) {
		super();
		this.id = obj.getId();
		this.tendencia = obj.getTendencia();
		this.vinculo = obj.getVinculo();
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

	public Vinculo getVinculo() {
		return vinculo;
	}

	public void setVinculo(@Valid Vinculo vinculo) {
		this.vinculo = vinculo;
	}

	public TendenciaVinculo toEntity() {
		return new TendenciaVinculo(this);
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
		TendenciaVinculoDTO other = (TendenciaVinculoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TendenciaVinculoDTO [id=" + id + ", tendencia=" + tendencia + ", vinculo=" + vinculo + "]";
	}

}
