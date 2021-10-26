package com.rafdev.fpdd.exceptions;

import com.rafdev.fpdd.constants.ConstantMessagesErro;

public class DataIntegrityException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DataIntegrityException() {
		super(ConstantMessagesErro.OBJETO_NAO_ENCONTRADO);
	}

	public DataIntegrityException(Throwable cause) {
		super(ConstantMessagesErro.OBJETO_NAO_ENCONTRADO, cause);
	}

	public DataIntegrityException(String msg) {
		super(msg);
	}

	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
