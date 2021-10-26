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

import com.rafdev.fpdd.domain.dtos.FichaJogadorDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = FichaJogador.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class FichaJogador extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBFICHAJOGADORFPDD";

	public static final String COLUMN_ID = "CFCHJGCODIGO";
	public static final String COLUMN_CLASSE = "CCLASSCODIGO";
	public static final String COLUMN_RACA = "CRACASCODIGO";
	public static final String COLUMN_ANTECEDENTE = "CANTECCODIGO";
	public static final String COLUMN_NOME = "NFCHJGNOMEJOGADOR";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TFCHJGULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_CLASSE, referencedColumnName = Classe.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Classe classe;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_RACA, referencedColumnName = Raca.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Raca raca;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_ANTECEDENTE, referencedColumnName = Antecedente.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Antecedente antecedente;

	@NotNull
	@Column(name = COLUMN_NOME, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String nome;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public FichaJogador() {
		super();
	}

	public FichaJogador(Long id, Classe classe, Raca raca, Antecedente antecedente, String nome) {
		super();
		this.id = id;
		this.classe = classe;
		this.raca = raca;
		this.antecedente = antecedente;
		this.nome = nome;
	}

	public FichaJogador(FichaJogadorDTO obj) {
		super();
		this.id = obj.getId();
		this.classe = obj.getClasse();
		this.raca = obj.getRaca();
		this.antecedente = obj.getAntecedente();
		this.nome = obj.getNome();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(@Valid Classe classe) {
		this.classe = classe;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(@Valid Raca raca) {
		this.raca = raca;
	}

	public Antecedente getAntecedente() {
		return antecedente;
	}

	public void setAntecedente(@Valid Antecedente antecedente) {
		this.antecedente = antecedente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	public FichaJogadorDTO toDto() {
		return new FichaJogadorDTO(this);
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
		FichaJogador other = (FichaJogador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FichaJogador [id=" + id + ", classe=" + classe + ", raca=" + raca + ", antecedente=" + antecedente
				+ ", nome=" + nome + ", ultimaAtualizacao=" + ultimaAtualizacao + "]";
	}

}
