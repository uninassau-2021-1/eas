package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.CorPele;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaCorPele;

public class SubRacaCorPeleDTO extends AbstractBackingDTO<SubRacaCorPele, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SubRaca subRaca;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private CorPele corPele;

	public SubRacaCorPeleDTO() {
		super();
	}

	public SubRacaCorPeleDTO(Long id, SubRaca subRaca, CorPele corPele) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.corPele = corPele;
	}

	public SubRacaCorPeleDTO(SubRacaCorPele obj) {
		super();
		this.id = obj.getId();
		this.subRaca = obj.getSubRaca();
		this.corPele = obj.getCorPele();
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

	public CorPele getCorPele() {
		return corPele;
	}

	public void setCorPele(@Valid CorPele corPele) {
		this.corPele = corPele;
	}

	public SubRacaCorPele toEntity() {
		return new SubRacaCorPele(this);
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
		SubRacaCorPeleDTO other = (SubRacaCorPeleDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaCorPeleDTO [id=" + id + ", subRaca=" + subRaca + ", corPele=" + corPele + "]";
	}

}
