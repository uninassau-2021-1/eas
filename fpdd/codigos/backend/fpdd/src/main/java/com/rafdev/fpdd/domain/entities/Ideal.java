package com.rafdev.fpdd.domain.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.rafdev.fpdd.domain.dtos.IdealDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = Ideal.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class Ideal extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String SIGLA = "IDEAL";

	public static final String TABLE_NAME = "TBIDEALFPDD";

	public static final String COLUMN_ID = "CIDEALCODIGO";
	public static final String COLUMN_ANTECEDENTE = "CANTECCODIGO";
	public static final String COLUMN_NOME_EN = "NIDEALNOMEEN";
	public static final String COLUMN_NOME_PTBR = "NIDEALNOMEPTBR";
	public static final String COLUMN_NOME_ES = "NIDEALNOMEES";
	public static final String COLUMN_OBSERVACAO = "XIDEALOBSERVACAO";
	public static final String COLUMN_STATUS = "FIDEALSTATUS";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TIDEALULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_ANTECEDENTE, referencedColumnName = Antecedente.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Antecedente antecedente;

	@Column(name = COLUMN_NOME_EN, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nomeEn;

	@NotNull
	@Column(name = COLUMN_NOME_PTBR, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nomePtBr;

	@Column(name = COLUMN_NOME_ES, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nomeEs;

	@Column(name = COLUMN_OBSERVACAO, columnDefinition = ColumnDefinitionTypes.TEXT, length = 2000)
	private String observacao;

	@NotNull
	@Column(name = COLUMN_STATUS, columnDefinition = ColumnDefinitionTypes.CHAR, length = 1)
	private Character status;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public Ideal() {
		super();
	}

	public Ideal(Long id, Antecedente antecedente, String nomeEn, String nomePtBr, String nomeEs, String observacao,
			StatusEnum status) {
		super();
		this.id = id;
		this.antecedente = antecedente;
		this.nomeEn = nomeEn;
		this.nomePtBr = nomePtBr;
		this.nomeEs = nomeEs;
		this.observacao = observacao;
		this.status = status.getCodigo();
	}

	public Ideal(IdealDTO obj) {
		super();
		this.id = obj.getId();
		this.antecedente = obj.getAntecedente();
		this.nomeEn = obj.getNomeEn();
		this.nomePtBr = obj.getNomePtBr();
		this.nomeEs = obj.getNomeEs();
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

	public Antecedente getAntecedente() {
		return antecedente;
	}

	public void setAntecedente(@Valid Antecedente antecedente) {
		this.antecedente = antecedente;
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
	public IdealDTO toDto() {
		return new IdealDTO(this);
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
		Ideal other = (Ideal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ideal [id=" + id + ", antecedente=" + antecedente + ", nomeEn=" + nomeEn + ", nomePtBr=" + nomePtBr
				+ ", nomeEs=" + nomeEs + ", observacao=" + observacao + ", status=" + status + ", ultimaAtualizacao="
				+ ultimaAtualizacao + "]";
	}

}
