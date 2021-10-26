package com.rafdev.fpdd.constants;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class ConstantLabels {

	public static final String LABEL_NOME_EN = "Nome (Inglês)";
	public static final String LABEL_NOME_PTBR = "Nome (Português-BR)";
	public static final String LABEL_NOME_ES = "Nome (Espanhol)";

	private ConstantLabels() {
		throw new ClassNotInstantiableException(ConstantLabels.class);
	}

}
