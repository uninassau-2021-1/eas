package com.rafdev.fpdd.domain.enums;

import com.rafdev.fpdd.domain.enums.model.IBackingEnum;
import com.rafdev.fpdd.exceptions.EnumNotFoundException;

public enum SimNaoEnum implements IBackingEnum<Character> {

	SIM('S', "Yes", "Sim", "Si"), NAO('N', "No", "Não", "No");

	private Character codigo;
	private String descricaoEn;
	private String descricaoPtBr;
	private String descricaoEs;

	SimNaoEnum(Character codigo, String descricaoEn, String descricaoPtBr, String descricaoEs) {
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

	public boolean isSim() {
		return SIM == this;
	}

	public boolean isNao() {
		return NAO == this;
	}

	public static SimNaoEnum toEnum(Character codigo) {
		if (codigo == null) {
			return null;
		}

		SimNaoEnum objEnum = null;
		for (SimNaoEnum e : SimNaoEnum.values()) {
			if (e.getCodigo().equals(codigo)) {
				objEnum = e;
				break;
			}
		}

		if (objEnum == null) {
			throw new EnumNotFoundException(codigo, SimNaoEnum.class);
		}

		return objEnum;
	}

}
