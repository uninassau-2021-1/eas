package com.rafdev.fpdd.constants;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class ConstantMessages {

	private ConstantMessages() {
		throw new ClassNotInstantiableException(ConstantMessages.class);
	}

	public static String getMesageFieldNotNull(String field) {
		final String erro = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO;
		String cut = "é obrigatório";
		int divider = erro.indexOf(cut);

		StringBuilder sb = new StringBuilder();

		sb.append(erro, 0, divider);
		if (field != null) {
			sb.append(field);
		}

		sb.append(erro, divider - 1, erro.length());
		return sb.toString();
	}

}
