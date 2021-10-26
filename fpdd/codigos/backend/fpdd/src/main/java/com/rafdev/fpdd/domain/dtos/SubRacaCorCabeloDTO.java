package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.CorCabelo;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaCorCabelo;

public class SubRacaCorCabeloDTO extends AbstractBackingDTO<SubRacaCorCabelo, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SubRaca subRaca;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private CorCabelo corCabelo;

	public SubRacaCorCabeloDTO() {
		super();
	}

	public SubRacaCorCabeloDTO(Long id, SubRaca subRaca, CorCabelo corCabelo) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.corCabelo = corCabelo;
	}

	public SubRacaCorCabeloDTO(SubRacaCorCabelo obj) {
		super();
		this.id = obj.getId();
		this.subRaca = obj.getSubRaca();
		this.corCabelo = obj.getCorCabelo();
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

	public CorCabelo getCorCabelo() {
		return corCabelo;
	}

	public void setCorCabelo(@Valid CorCabelo corCabelo) {
		this.corCabelo = corCabelo;
	}

	public SubRacaCorCabelo toEntity() {
		return new SubRacaCorCabelo(this);
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
		SubRacaCorCabeloDTO other = (SubRacaCorCabeloDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaCorCabeloDTO [id=" + id + ", subRaca=" + subRaca + ", corCabelo=" + corCabelo + "]";
	}

}
