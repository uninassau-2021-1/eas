package com.rafdev.fpdd.domain.enums;

import com.rafdev.fpdd.domain.enums.model.IBackingEnum;
import com.rafdev.fpdd.exceptions.EnumNotFoundException;

public enum StatusEnum implements IBackingEnum<Character> {

	ATIVO('A', "Active", "Ativo", "Activo"), INATIVO('I', "Inactive", "Inativo", "inactivo");

	private Character codigo;
	private String descricaoEn;
	private String descricaoPtBr;
	private String descricaoEs;

	StatusEnum(Character codigo, String descricaoEn, String descricaoPtBr, String descricaoEs) {
		this.codigo = codigo;
		this.descricaoEn = descricaoEn;
		this.descricaoPtBr = descricaoPtBr;
		this.descricaoEs = descricaoEs;
	}

	@Override
	public Character getCodigo() {
		return codigo;
	}

	public String getDescricaoEn() {
		return descricaoEn;
	}

	public String getDescricaoPtBr() {
		return descricaoPtBr;
	}

	public String getDescricaoEs() {
		return descricaoEs;
	}

	public boolean isAtivo() {
		return ATIVO == this;
	}

	public boolean isInativo() {
		return INATIVO == this;
	}

	public static StatusEnum toEnum(Character codigo) {
		if (codigo == null) {
			return null;
		}

		StatusEnum objEnum = null;
		for (StatusEnum e : StatusEnum.values()) {
			if (e.getCodigo().equals(codigo)) {
				objEnum = e;
				break;
			}
		}

		if (objEnum == null) {
			throw new EnumNotFoundException(codigo, StatusEnum.class);
		}

		return objEnum;
	}

}
