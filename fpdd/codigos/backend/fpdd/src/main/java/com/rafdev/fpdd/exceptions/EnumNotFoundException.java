package com.rafdev.fpdd.exceptions;

public class EnumNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EnumNotFoundException(Object codigo, Class<?> type) {
		super(getMessage(codigo, type));
	}

	private static String getMessage(Object codigo, Class<?> type) {
		StringBuilder sb = new StringBuilder("O código ");

		sb.append(String.valueOf(codigo));
		sb.append(" não foi encontrado em ");
		sb.append(type.getName());

		return sb.toString();
	}

}
