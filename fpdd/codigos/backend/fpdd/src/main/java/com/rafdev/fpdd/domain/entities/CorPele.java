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

import com.rafdev.fpdd.domain.dtos.CorPeleDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = CorPele.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class CorPele extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String SIGLA = "CRPEL";

	public static final String TABLE_NAME = "TBCORPELEFPDD";

	public static final String COLUMN_ID = "CCRPELCODIGO";
	public static final String COLUMN_NOME_EN = "NCRPELNOMEEN";
	public static final String COLUMN_NOME_PTBR = "NCRPELNOMEPTBR";
	public static final String COLUMN_NOME_ES = "NCRPELNOMEES";
	public static final String COLUMN_OBSERVACAO = "XCRPELOBSERVACAO";
	public static final String COLUMN_STATUS = "FCRPELSTATUS";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TCRPELULAT";

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

	@Column(name = COLUMN_OBSERVACAO, columnDefinition = ColumnDefinitionTypes.TEXT, length = 2000)
	private String observacao;

	@NotNull
	@Column(name = COLUMN_STATUS, columnDefinition = ColumnDefinitionTypes.CHAR, length = 1)
	private Character status;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public CorPele() {
		super();
	}

	public CorPele(Long id, String nomeEn, String nomePtBr, String nomeEs, String observacao, StatusEnum status) {
		super();
		this.id = id;
		this.nomeEn = nomeEn;
		this.nomePtBr = nomePtBr;
		this.nomeEs = nomeEs;
		this.observacao = observacao;
		this.status = status.getCodigo();
	}

	public CorPele(CorPeleDTO obj) {
		super();
		this.id = obj.getId();
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
	public CorPeleDTO toDto() {
		return new CorPeleDTO(this);
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
		CorPele other = (CorPele) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CorPele [id=" + id + ", nomeEn=" + nomeEn + ", nomePtBr=" + nomePtBr + ", nomeEs=" + nomeEs
				+ ", observacao=" + observacao + ", status=" + status + ", ultimaAtualizacao=" + ultimaAtualizacao
				+ "]";
	}

}