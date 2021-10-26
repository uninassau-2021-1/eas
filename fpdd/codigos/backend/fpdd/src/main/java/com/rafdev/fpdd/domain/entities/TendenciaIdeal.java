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

import com.rafdev.fpdd.domain.dtos.TendenciaIdealDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = TendenciaIdeal.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class TendenciaIdeal extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBTENDIDEALFPDD";

	public static final String COLUMN_ID = "CTDIDECODIGO";
	public static final String COLUMN_TENDENCIA = "CTENDECODIGO";
	public static final String COLUMN_IDEAL = "CIDEALCODIGO";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TTDIDEULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_TENDENCIA, referencedColumnName = Tendencia.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Tendencia tendencia;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_IDEAL, referencedColumnName = Ideal.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Ideal ideal;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public TendenciaIdeal() {
		super();
	}

	public TendenciaIdeal(Long id, Tendencia tendencia, Ideal ideal) {
		super();
		this.id = id;
		this.tendencia = tendencia;
		this.ideal = ideal;
	}

	public TendenciaIdeal(TendenciaIdealDTO obj) {
		super();
		this.id = obj.getId();
		this.tendencia = obj.getTendencia();
		this.ideal = obj.getIdeal();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tendencia getTendencia() {
		return tendencia;
	}

	public void setTendencia(@Valid Tendencia tendencia) {
		this.tendencia = tendencia;
	}

	public Ideal getIdeal() {
		return ideal;
	}

	public void setIdeal(@Valid Ideal ideal) {
		this.ideal = ideal;
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
	public TendenciaIdealDTO toDto() {
		return new TendenciaIdealDTO(this);
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
		TendenciaIdeal other = (TendenciaIdeal) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TendenciaIdeal [id=" + id + ", tendencia=" + tendencia + ", ideal=" + ideal + ", ultimaAtualizacao="
				+ ultimaAtualizacao + "]";
	}

}
