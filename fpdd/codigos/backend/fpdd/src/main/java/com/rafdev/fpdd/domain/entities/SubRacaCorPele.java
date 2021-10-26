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

import com.rafdev.fpdd.domain.dtos.SubRacaCorPeleDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = SubRacaCorPele.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class SubRacaCorPele extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBSBRACACRPELEFPDD";

	public static final String COLUMN_ID = "CSRCPLCODIGO";
	public static final String COLUMN_SUBRACA = "CSBRACCODIGO";
	public static final String COLUMN_COR_PELE = "CCRPELCODIGO";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TSRCPLULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_SUBRACA, referencedColumnName = SubRaca.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private SubRaca subRaca;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_COR_PELE, referencedColumnName = CorPele.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private CorPele corPele;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public SubRacaCorPele() {
		super();
	}

	public SubRacaCorPele(Long id, SubRaca subRaca, CorPele corPele) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.corPele = corPele;
	}

	public SubRacaCorPele(SubRacaCorPeleDTO obj) {
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

	@Override
	public LocalDateTime getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	@Override
	public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	@Override
	@SuppressWarnings("unchecked")
	public SubRacaCorPeleDTO toDto() {
		return new SubRacaCorPeleDTO(this);
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
		SubRacaCorPele other = (SubRacaCorPele) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaCorPele [id=" + id + ", subRaca=" + subRaca + ", corPele=" + corPele + ", ultimaAtualizacao="
				+ ultimaAtualizacao + "]";
	}

}
