package com.rafdev.fpdd.domain.filters.model;

public interface IFilter<T> {

	Integer getPage();

	Integer getLinesPerPage();

	void setLinesPerPage(Integer linesPerPage);

	String getOrderBy();

	String getDirection();

	void setDirection(String direction);
}
