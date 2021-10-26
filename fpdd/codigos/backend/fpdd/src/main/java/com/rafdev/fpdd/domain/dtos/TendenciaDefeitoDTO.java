package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Defeito;
import com.rafdev.fpdd.domain.entities.Tendencia;
import com.rafdev.fpdd.domain.entities.TendenciaDefeito;

public class TendenciaDefeitoDTO extends AbstractBackingDTO<TendenciaDefeito, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Tendencia tendencia;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Defeito defeito;

	public TendenciaDefeitoDTO() {
		super();
	}

	public TendenciaDefeitoDTO(Long id, Tendencia tendencia, Defeito defeito) {
		super();
		this.id = id;
		this.tendencia = tendencia;
		this.defeito = defeito;
	}

	public TendenciaDefeitoDTO(TendenciaDefeito obj) {
		super();
		this.id = obj.getId();
		this.tendencia = obj.getTendencia();
		this.defeito = obj.getDefeito();
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

	public Defeito getDefeito() {
		return defeito;
	}

	public void setDefeito(@Valid Defeito defeito) {
		this.defeito = defeito;
	}

	public TendenciaDefeito toEntity() {
		return new TendenciaDefeito(this);
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
		TendenciaDefeitoDTO other = (TendenciaDefeitoDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TendenciaDefeitoDTO [id=" + id + ", tendencia=" + tendencia + ", defeito=" + defeito + "]";
	}

}
