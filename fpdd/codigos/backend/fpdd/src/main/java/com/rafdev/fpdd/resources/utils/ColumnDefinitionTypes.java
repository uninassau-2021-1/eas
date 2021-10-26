package com.rafdev.fpdd.resources.utils;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class ColumnDefinitionTypes {

	public static final String SMALLINT = "SMALLINT";
	public static final String SMALLINT_UNSIGNED = "SMALLINT UNSIGNED";
	public static final String NUMERIC = "NUMERIC";
	public static final String DECIMAL = "DECIMAL";
	public static final String BIGINT = "BIGINT";
	public static final String BIGINT_UNSIGNED = "BIGINT UNSIGNED";
	public static final String TEXT = "VARCHAR";
	public static final String VARCHAR = "VARCHAR";
	public static final String CHAR = "CHAR";
	public static final String DATE = "DATE";
	public static final String TIMESTAMP = "TIMESTAMP";

	private ColumnDefinitionTypes() {
		throw new ClassNotInstantiableException(ColumnDefinitionTypes.class);
	}

}
