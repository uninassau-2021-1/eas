package com.rafdev.fpdd.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.rafdev.fpdd.domain.dtos.RacaDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = Raca.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class Raca extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBRACAFPDD";

	public static final String COLUMN_ID = "CRACASCODIGO";
	public static final String COLUMN_NOME_EN = "NRACASNOMEEN";
	public static final String COLUMN_NOME_PTBR = "NRACASNOMEPTBR";
	public static final String COLUMN_NOME_ES = "NRACASNOMEES";
	public static final String COLUMN_ALTURA_MAX = "VRACASALTURAMAX";
	public static final String COLUMN_ALTURA_MIN = "VRACASALTURAMIN";
	public static final String COLUMN_PESO_MAX = "VRACASPESOMAX";
	public static final String COLUMN_PESO_MIN = "VRACASPESOMIN";
	public static final String COLUMN_IDADE_MAX = "ARACASIDADEMAX";
	public static final String COLUMN_IDADE_MIN = "ARACASIDADEMIN";
	public static final String COLUMN_OBSERVACAO = "XRACASOBSERVACAO";
	public static final String COLUMN_STATUS = "FRACASSTATUS";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TRACASULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@Column(name = COLUMN_NOME_EN, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nomeEn;

	@NotNull
	@Column(name = COLUMN_NOME_PTBR, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nomePtBr;

	@Column(name = COLUMN_NOME_ES, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nomeEs;

	@NotNull
	@Column(name = COLUMN_ALTURA_MAX, columnDefinition = ColumnDefinitionTypes.SMALLINT_UNSIGNED, precision = 4)
	private Short alturaMax;

	@NotNull
	@Column(name = COLUMN_ALTURA_MIN, columnDefinition = ColumnDefinitionTypes.SMALLINT_UNSIGNED, precision = 4)
	private Short alturaMin;

	@NotNull
	@Column(name = COLUMN_PESO_MAX, columnDefinition = ColumnDefinitionTypes.DECIMAL, precision = 4, scale = 2)
	private Float pesoMax;

	@NotNull
	@Column(name = COLUMN_PESO_MIN, columnDefinition = ColumnDefinitionTypes.DECIMAL, precision = 4, scale = 2)
	private Float pesoMin;

	@NotNull
	@Column(name = COLUMN_IDADE_MAX, columnDefinition = ColumnDefinitionTypes.SMALLINT_UNSIGNED, precision = 4)
	private Short idadeMax;

	@NotNull
	@Column(name = COLUMN_IDADE_MIN, columnDefinition = ColumnDefinitionTypes.SMALLINT_UNSIGNED, precision = 4)
	private Short idadeMin;

	@Column(name = COLUMN_OBSERVACAO, columnDefinition = ColumnDefinitionTypes.TEXT, length = 2000)
	private String observacao;

	@NotNull
	@Column(name = COLUMN_STATUS, columnDefinition = ColumnDefinitionTypes.CHAR, length = 1)
	private Character status;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public Raca() {
		super();
	}

	public Raca(Long id, String nomeEn, String nomePtBr, String nomeEs, Short alturaMax, Short alturaMin, Float pesoMax,
			Float pesoMin, Short idadeMax, Short idadeMin, String observacao, Character status,
			LocalDateTime ultimaAtualizacao) {
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
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	public Raca(RacaDTO obj) {
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
		this.status = obj.getStatus().getCodigo();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
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
		return StatusEnum.toEnum(status);
	}

	public void setStatus(StatusEnum status) {
		this.status = status == null ? null : status.getCodigo();
	}

	@Autowired
	public LocalDateTime getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	@Autowired
	public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	@Override
	@SuppressWarnings("unchecked")
	public RacaDTO toDto() {
		return new RacaDTO(this);
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
		Raca other = (Raca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Raca [id=" + id + ", nomeEn=" + nomeEn + ", nomePtBr=" + nomePtBr + ", nomeEs=" + nomeEs
				+ ", alturaMax=" + alturaMax + ", alturaMin=" + alturaMin + ", pesoMax=" + pesoMax + ", pesoMin="
				+ pesoMin + ", idadeMax=" + idadeMax + ", idadeMin=" + idadeMin + ", observacao=" + observacao
				+ ", status=" + status + ", ultimaAtualizacao=" + ultimaAtualizacao + "]";
	}

}
