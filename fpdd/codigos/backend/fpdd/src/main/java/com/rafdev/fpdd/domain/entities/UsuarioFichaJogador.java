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

import com.rafdev.fpdd.domain.dtos.UsuarioFichaJogadorDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = UsuarioFichaJogador.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class UsuarioFichaJogador extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBUSUARIOFICHAPSGFPDD";

	public static final String COLUMN_ID = "CUSFPGCODIGO";
	public static final String COLUMN_USUARIO = "CUSUARCODIGO";
	public static final String COLUMN_FICHA_JOGADOR = "CFCHJGCODIGO";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TUSFPGULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_USUARIO, referencedColumnName = Usuario.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private Usuario usuario;

	@Valid
	@NotNull
	@ManyToOne
	@JoinColumn(name = COLUMN_FICHA_JOGADOR, referencedColumnName = FichaJogador.COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED)
	private FichaJogador fichaJogador;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public UsuarioFichaJogador() {
		super();
	}

	public UsuarioFichaJogador(Long id, Usuario usuario, FichaJogador fichaJogador) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.fichaJogador = fichaJogador;
	}

	public UsuarioFichaJogador(UsuarioFichaJogadorDTO obj) {
		super();
		this.id = obj.getId();
		this.usuario = obj.getUsuario();
		this.fichaJogador = obj.getFichaJogador();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(@Valid Usuario usuario) {
		this.usuario = usuario;
	}

	public FichaJogador getFichaJogador() {
		return fichaJogador;
	}

	public void setFichaJogador(@Valid FichaJogador fichaJogador) {
		this.fichaJogador = fichaJogador;
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
	public UsuarioFichaJogadorDTO toDto() {
		return new UsuarioFichaJogadorDTO(this);
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
		UsuarioFichaJogador other = (UsuarioFichaJogador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioFichaJogador [id=" + id + ", usuario=" + usuario + ", fichaJogador=" + fichaJogador
				+ ", ultimaAtualizacao=" + ultimaAtualizacao + "]";
	}

}
