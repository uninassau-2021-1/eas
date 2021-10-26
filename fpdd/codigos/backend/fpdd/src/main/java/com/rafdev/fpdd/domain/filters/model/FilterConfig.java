package com.rafdev.fpdd.domain.filters.model;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class FilterConfig {

	public static final Integer PAGE = 0;
	public static final Integer LINES_PER_PAGE = 12;
	public static final String ORDER_BY = "ultimaAtualizacao";
	public static final String DIRECTION = "ASC";

	private FilterConfig() {
		throw new ClassNotInstantiableException(FilterConfig.class);
	}

	public static <T extends AbstractBackingFilter<?, ?>> PageRequest getPageRequest(T filter) {
		return PageRequest.of(filter.getPage(), filter.getLinesPerPage(), Direction.valueOf(filter.getDirection()),
				filter.getOrderBy());
	}

}
