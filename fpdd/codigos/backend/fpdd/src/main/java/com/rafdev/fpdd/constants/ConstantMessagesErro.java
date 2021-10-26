package com.rafdev.fpdd.constants;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class ConstantMessagesErro {

	public static final String OBJETO_NAO_ENCONTRADO = "Objeto não encontado!";
	public static final String CAMPO_NAO_PODE_SER_NULO = "O campo é obrigatório";
	public static final String CLASSE_NAO_INSTACIAVEL = "A classe não é instaciável";
	public static final String ERRO_VALIDACAO = "Erro de validação";

	private ConstantMessagesErro() {
		throw new ClassNotInstantiableException(ConstantMessagesErro.class);
	}

}
