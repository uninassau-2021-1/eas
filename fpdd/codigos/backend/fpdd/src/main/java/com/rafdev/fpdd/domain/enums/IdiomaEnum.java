package com.rafdev.fpdd.domain.enums;

import com.rafdev.fpdd.domain.enums.model.IBackingEnum;
import com.rafdev.fpdd.exceptions.EnumNotFoundException;

public enum IdiomaEnum implements IBackingEnum<String> {

	EN("en", "English"), PTBR("pt-BR", "Português"), ES("es", "Español");

	private String codigo;
	private String descricao;

	IdiomaEnum(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isEn() {
		return EN == this;
	}

	public boolean isPtbr() {
		return PTBR == this;
	}

	public boolean isEs() {
		return ES == this;
	}

	public static IdiomaEnum toEnum(String codigo) {
		if (codigo == null) {
			return null;
		}

		IdiomaEnum objEnum = null;
		for (IdiomaEnum e : IdiomaEnum.values()) {
			if (e.getCodigo().equals(codigo)) {
				objEnum = e;
				break;
			}
		}

		if (objEnum == null) {
			throw new EnumNotFoundException(codigo, IdiomaEnum.class);
		}

		return objEnum;
	}

}
