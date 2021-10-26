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

import com.rafdev.fpdd.domain.dtos.SubRacaCorOlhosDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = SubRacaCorOlhos.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class SubRacaCorOlhos extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBSBRACACROLHFPDD";

	public static final String COLUMN_ID = "CSRCOLCODIGO";
	public static final String COLUMN_SUBRACA = "CSBRACCODIGO";
	public static final String COLUMN_COR_OLHOS = "CCROLHCODIGO";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TSRCOLULAT";

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
	@JoinColumn(name = COLUMN_COR_OLHOS, referencedColumnName = CorOlhos.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private CorOlhos corOlhos;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public SubRacaCorOlhos() {
		super();
	}

	public SubRacaCorOlhos(Long id, SubRaca subRaca, CorOlhos corOlhos) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.corOlhos = corOlhos;
	}

	public SubRacaCorOlhos(SubRacaCorOlhosDTO obj) {
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
	public SubRacaCorOlhosDTO toDto() {
		return new SubRacaCorOlhosDTO(this);
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
		SubRacaCorOlhos other = (SubRacaCorOlhos) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaCorOlhos [id=" + id + ", subRaca=" + subRaca + ", corOlhos=" + corOlhos + ", ultimaAtualizacao="
				+ ultimaAtualizacao + "]";
	}

}
