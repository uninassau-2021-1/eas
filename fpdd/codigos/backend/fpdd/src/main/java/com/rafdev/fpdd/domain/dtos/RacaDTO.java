package com.rafdev.fpdd.domain.dtos;

import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Raca;
import com.rafdev.fpdd.domain.enums.StatusEnum;

public class RacaDTO extends AbstractBackingDTO<Raca, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String nomeEn;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String nomePtBr;

	private String nomeEs;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Short alturaMax;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Short alturaMin;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Float pesoMax;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Float pesoMin;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Short idadeMax;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Short idadeMin;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String observacao;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private StatusEnum status;

	public RacaDTO() {
		super();
	}

	public RacaDTO(Long id, String nomeEn, String nomePtBr, String nomeEs, Short alturaMax, Short alturaMin,
			Float pesoMax, Float pesoMin, Short idadeMax, Short idadeMin, String observacao, StatusEnum status) {
		super();
		this.id = id;
		this.nomeEn = nomeEn;
		this.nomePtBr = nomePtBr;
		this.nomeEs = nomeEs;
		this.alturaMax = alturaMax;
		this.alturaMin = alturaMin;
		this.pesoMax = pesoMax;
		this.pesoMin = pesoMin;
		this.idadeMax = idadeMax;
		this.idadeMin = idadeMin;
		this.observacao = observacao;
		this.status = status;
	}

	public RacaDTO(Raca obj) {
		super();
		this.id = obj.getId();
		this.nomeEn = obj.getNomeEn();
		this.nomePtBr = obj.getNomePtBr();
		this.nomeEs = obj.getNomeEs();
		this.alturaMax = obj.getAlturaMax();
		this.alturaMin = obj.getAlturaMin();
		this.pesoMax = obj.getPesoMax();
		this.pesoMin = obj.getPesoMin();
		this.idadeMax = obj.getIdadeMax();
		this.idadeMin = obj.getIdadeMin();
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

	public Short getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(Short alturaMax) {
		this.alturaMax = alturaMax;
	}

	public Short getAlturaMin() {
		return alturaMin;
	}

	public void setAlturaMin(Short alturaMin) {
		this.alturaMin = alturaMin;
	}

	public Float getPesoMax() {
		return pesoMax;
	}

	public void setPesoMax(Float pesoMax) {
		this.pesoMax = pesoMax;
	}

	public Float getPesoMin() {
		return pesoMin;
	}

	public void setPesoMin(Float pesoMin) {
		this.pesoMin = pesoMin;
	}

	public Short getIdadeMax() {
		return idadeMax;
	}

	public void setIdadeMax(Short idadeMax) {
		this.idadeMax = idadeMax;
	}

	public Short getIdadeMin() {
		return idadeMin;
	}

	public void setIdadeMin(Short idadeMin) {
		this.idadeMin = idadeMin;
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

	public Raca toEntity() {
		return new Raca(this);
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
		RacaDTO other = (RacaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RacaDTO [id=" + id + ", nomeEn=" + nomeEn + ", nomePtBr=" + nomePtBr + ", nomeEs=" + nomeEs
				+ ", alturaMax=" + alturaMax + ", alturaMin=" + alturaMin + ", pesoMax=" + pesoMax + ", pesoMin="
				+ pesoMin + ", idadeMax=" + idadeMax + ", idadeMin=" + idadeMin + ", observacao=" + observacao
				+ ", status=" + status + "]";
	}

}
