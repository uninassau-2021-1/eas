package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.CorOlhos;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaCorOlhos;

public class SubRacaCorOlhosDTO extends AbstractBackingDTO<SubRacaCorOlhos, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SubRaca subRaca;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private CorOlhos corOlhos;

	public SubRacaCorOlhosDTO() {
		super();
	}

	public SubRacaCorOlhosDTO(Long id, SubRaca subRaca, CorOlhos corOlhos) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.corOlhos = corOlhos;
	}

	public SubRacaCorOlhosDTO(SubRacaCorOlhos obj) {
		super();
		this.id = obj.getId();
		this.subRaca = obj.getSubRaca();
		this.corOlhos = obj.getCorOlhos();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SubRaca getSubRaca() {
		return subRaca;
	}

	public void setSubRaca(@Valid SubRaca subRaca) {
		this.subRaca = subRaca;
	}

	public CorOlhos getCorOlhos() {
		return corOlhos;
	}

	public void setCorOlhos(@Valid CorOlhos corOlhos) {
		this.corOlhos = corOlhos;
	}

	public SubRacaCorOlhos toEntity() {
		return new SubRacaCorOlhos(this);
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
		SubRacaCorOlhosDTO other = (SubRacaCorOlhosDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaCorOlhosDTO [id=" + id + ", subRaca=" + subRaca + ", corOlhos=" + corOlhos + "]";
	}

}
