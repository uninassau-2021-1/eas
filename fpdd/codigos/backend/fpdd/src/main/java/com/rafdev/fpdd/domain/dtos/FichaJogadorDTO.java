package com.rafdev.fpdd.domain.dtos;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Antecedente;
import com.rafdev.fpdd.domain.entities.Classe;
import com.rafdev.fpdd.domain.entities.FichaJogador;
import com.rafdev.fpdd.domain.entities.Raca;

public class FichaJogadorDTO extends AbstractBackingDTO<FichaJogador, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Classe classe;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Raca raca;

	@Valid
	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private Antecedente antecedente;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String nome;

	public FichaJogadorDTO() {
		super();
	}

	public FichaJogadorDTO(Long id, Classe classe, Raca raca, Antecedente antecedente, String nome) {
		super();
		this.id = id;
		this.classe = classe;
		this.raca = raca;
		this.antecedente = antecedente;
		this.nome = nome;
	}

	public FichaJogadorDTO(FichaJogador obj) {
		super();
		this.id = obj.getId();
		this.classe = obj.getClasse();
		this.raca = obj.getRaca();
		this.antecedente = obj.getAntecedente();
		this.nome = obj.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Antecedente getAntecedente() {
		return antecedente;
	}

	public void setAntecedente(@Valid Antecedente antecedente) {
		this.antecedente = antecedente;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public FichaJogador toEntity() {
		return new FichaJogador(this);
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
		FichaJogadorDTO other = (FichaJogadorDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FichaJogadorDTO [id=" + id + ", classe=" + classe + ", raca=" + raca + ", antecedente=" + antecedente
				+ ", nome=" + nome + "]";
	}

}
