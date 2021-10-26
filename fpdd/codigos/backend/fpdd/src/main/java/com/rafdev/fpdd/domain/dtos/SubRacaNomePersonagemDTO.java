package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.NomePersonagem;
import com.rafdev.fpdd.domain.entities.SubRaca;
import com.rafdev.fpdd.domain.entities.SubRacaNomePersonagem;

public class SubRacaNomePersonagemDTO extends AbstractBackingDTO<SubRacaNomePersonagem, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SubRaca subRaca;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private NomePersonagem nomePersonagem;

	public SubRacaNomePersonagemDTO() {
		super();
	}

	public SubRacaNomePersonagemDTO(Long id, SubRaca subRaca, NomePersonagem nomePersonagem) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.nomePersonagem = nomePersonagem;
	}

	public SubRacaNomePersonagemDTO(SubRacaNomePersonagem obj) {
		super();
		this.id = obj.getId();
		this.subRaca = obj.getSubRaca();
		this.nomePersonagem = obj.getNomePersonagem();
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

	public NomePersonagem getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(@Valid NomePersonagem nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public SubRacaNomePersonagem toEntity() {
		return new SubRacaNomePersonagem(this);
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
		SubRacaNomePersonagemDTO other = (SubRacaNomePersonagemDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaNomePersonagemDTO [id=" + id + ", subRaca=" + subRaca + ", nomePersonagem=" + nomePersonagem
				+ "]";
	}

}
