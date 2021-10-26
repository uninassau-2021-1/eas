package com.rafdev.fpdd.exceptions;

import com.rafdev.fpdd.constants.ConstantMessagesErro;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException() {
		super(ConstantMessagesErro.OBJETO_NAO_ENCONTRADO);
	}

	public ObjectNotFoundException(Throwable cause) {
		super(ConstantMessagesErro.OBJETO_NAO_ENCONTRADO, cause);
	}

	public ObjectNotFoundException(String msg) {
		super(msg);
	}

	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public ObjectNotFoundException(Long id) {
		super(getMessage(id));
	}

	public ObjectNotFoundException(String msg, Long id) {
		super(getMessage(msg, id));
	}

	public ObjectNotFoundException(Long id, Throwable cause) {
		super(getMessage(id), cause);
	}

	public ObjectNotFoundException(String msg, Long id, Throwable cause) {
		super(getMessage(msg, id), cause);
	}

	public ObjectNotFoundException(Class<?> type) {
		super(getMessage(null, type));
	}

	public ObjectNotFoundException(String msg, Class<?> type) {
		super(getMessage(msg, null, type));
	}

	public ObjectNotFoundException(Class<?> type, Throwable cause) {
		super(getMessage(null, type), cause);
	}

	public ObjectNotFoundException(String msg, Class<?> type, Throwable cause) {
		super(getMessage(msg, null, type), cause);
	}

	public ObjectNotFoundException(Long id, Class<?> type) {
		super(getMessage(id, type));
	}

	public ObjectNotFoundException(String msg, Long id, Class<?> type) {
		super(getMessage(msg, id, type));
	}

	public ObjectNotFoundException(Long id, Class<?> type, Throwable cause) {
		super(getMessage(id, type), cause);
	}

	public ObjectNotFoundException(String msg, Long id, Class<?> type, Throwable cause) {
		super(getMessage(msg, id, type), cause);
	}

	private static String getMessage(Long id) {
		StringBuilder sb = new StringBuilder(ConstantMessagesErro.OBJETO_NAO_ENCONTRADO);

		if (id == null) {
			return sb.toString();
		}

		sb.append(" Id: ");
		sb.append(id);
		return sb.toString();
	}

	private static String getMessage(String msg, Long id) {
		StringBuilder sb = new StringBuilder();

		if (msg == null || msg.isEmpty() || msg.isBlank()) {
			sb.append(ConstantMessagesErro.OBJETO_NAO_ENCONTRADO);
		} else {
			sb.append(msg);
		}

		if (id == null) {
			return sb.toString();
		}

		sb.append(" Id: ");
		sb.append(id);
		return sb.toString();
	}

	private static String getMessage(Long id, Class<?> type) {
		StringBuilder sb = new StringBuilder(getMessage(id));

		sb.append(", Tipo: ");
		sb.append(type.getName());

		return sb.toString();
	}

	private static String getMessage(String msg, Long id, Class<?> type) {
		StringBuilder sb = new StringBuilder(getMessage(msg, id));

		sb.append(", Tipo: ");
		sb.append(type.getName());

		return sb.toString();
	}

}
