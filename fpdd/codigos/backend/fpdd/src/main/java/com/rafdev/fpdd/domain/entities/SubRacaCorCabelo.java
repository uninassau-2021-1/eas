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

import com.rafdev.fpdd.domain.dtos.SubRacaCorCabeloDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = SubRacaCorCabelo.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class SubRacaCorCabelo extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBSBRACACRCBLFPDD";

	public static final String COLUMN_ID = "CSRCCBCODIGO";
	public static final String COLUMN_SUBRACA = "CSBRACCODIGO";
	public static final String COLUMN_COR_CABELO = "CCRCBLCODIGO";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TSRCCBULAT";

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
	@JoinColumn(name = COLUMN_COR_CABELO, referencedColumnName = CorCabelo.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private CorCabelo corCabelo;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public SubRacaCorCabelo() {
		super();
	}

	public SubRacaCorCabelo(Long id, SubRaca subRaca, CorCabelo corCabelo) {
		super();
		this.id = id;
		this.subRaca = subRaca;
		this.corCabelo = corCabelo;
	}

	public SubRacaCorCabelo(SubRacaCorCabeloDTO obj) {
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
	public SubRacaCorCabeloDTO toDto() {
		return new SubRacaCorCabeloDTO(this);
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
		SubRacaCorCabelo other = (SubRacaCorCabelo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SubRacaCorCabelo [id=" + id + ", subRaca=" + subRaca + ", corCabelo=" + corCabelo
				+ ", ultimaAtualizacao=" + ultimaAtualizacao + "]";
	}

}
