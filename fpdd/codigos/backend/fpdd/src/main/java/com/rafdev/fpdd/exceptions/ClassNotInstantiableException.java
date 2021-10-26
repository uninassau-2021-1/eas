package com.rafdev.fpdd.exceptions;

import com.rafdev.fpdd.constants.ConstantMessagesErro;

public class ClassNotInstantiableException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ClassNotInstantiableException() {
		super(getMessage(null));
	}

	public ClassNotInstantiableException(Throwable cause) {
		super(getMessage(null), cause);
	}

	public ClassNotInstantiableException(Class<?> clazz) {
		super(getMessage(clazz.getSimpleName()));
	}

	public ClassNotInstantiableException(String msg) {
		super(msg);
	}

	public ClassNotInstantiableException(String msg, Throwable cause) {
		super(msg, cause);
	}

	private static String getMessage(String clazz) {
		final String erro = ConstantMessagesErro.CLASSE_NAO_INSTACIAVEL;
		String cut = "não é instaciável";
		int divider = erro.indexOf(cut);

		StringBuilder sb = new StringBuilder();

		sb.append(erro, 0, divider);
		if (clazz != null) {
			sb.append(clazz);
		}

		sb.append(erro, divider - 1, erro.length());
		return sb.toString();
	}

}
