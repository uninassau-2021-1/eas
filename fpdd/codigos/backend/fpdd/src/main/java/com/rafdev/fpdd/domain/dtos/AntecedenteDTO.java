package com.rafdev.fpdd.domain.dtos;

import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Antecedente;
import com.rafdev.fpdd.domain.enums.StatusEnum;

public class AntecedenteDTO extends AbstractBackingDTO<Antecedente, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nomeEn;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String nomePtBr;

	private String nomeEs;

	private String observacao;

	private StatusEnum status;

	public AntecedenteDTO() {
		super();
	}

	public AntecedenteDTO(Long id, String nomeEn, String nomePtBr, String nomeEs, String observacao,
			StatusEnum status) {
		super();
		this.id = id;
		this.nomeEn = nomeEn;
		this.nomePtBr = nomePtBr;
		this.nomeEs = nomeEs;
		this.observacao = observacao;
		this.status = status;
	}

	public AntecedenteDTO(Antecedente obj) {
		super();
		this.id = obj.getId();
		this.nomeEn = obj.getNomeEn();
		this.nomePtBr = obj.getNomePtBr();
		this.nomeEs = obj.getNomeEs();
		this.observacao = obj.getObservacao();
		this.status = obj.getStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeEn() {
		return nomeEn;
	}

	public void setNomeEn(String nomeEn) {
		this.nomeEn = nomeEn;
	}

	public String getNomePtBr() {
		return nomePtBr;
	}

	public void setNomePtBr(String nomePtBr) {
		this.nomePtBr = nomePtBr;
	}

	public String getNomeEs() {
		return nomeEs;
	}

	public void setNomeEs(String nomeEs) {
		this.nomeEs = nomeEs;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Antecedente toEntity() {
		return new Antecedente(this);
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
		AntecedenteDTO other = (AntecedenteDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AntecedenteDTO [id=" + id + ", nomeEn=" + nomeEn + ", nomePtBr=" + nomePtBr + ", nomeEs=" + nomeEs
				+ ", observacao=" + observacao + ", status=" + status + "]";
	}

}
