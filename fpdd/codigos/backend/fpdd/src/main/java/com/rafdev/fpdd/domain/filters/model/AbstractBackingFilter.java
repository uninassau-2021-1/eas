package com.rafdev.fpdd.domain.filters.model;

import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;

public abstract class AbstractBackingFilter<T extends AbstractBackingEntity<K>, K> implements IFilter<T> {

	private Integer page;
	private Integer linesPerPage;
	private String orderBy;
	private String direction;

	protected AbstractBackingFilter() {
		this.page = FilterConfig.PAGE;
		this.linesPerPage = FilterConfig.LINES_PER_PAGE;
		this.orderBy = FilterConfig.ORDER_BY;
		this.direction = FilterConfig.DIRECTION;
	}

	protected AbstractBackingFilter(Integer page, Integer linesPerPage, String orderBy, String direction) {
		super();
		this.page = page;
		this.linesPerPage = linesPerPage;
		this.orderBy = orderBy;
		this.direction = direction;
	}

	@Override
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	@Override
	public Integer getLinesPerPage() {
		return linesPerPage;
	}

	public void setLinesPerPage(Integer linesPerPage) {
		this.linesPerPage = linesPerPage;
	}

	@Override
	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	@Override
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public abstract IFilter<T> getFilterDecoded();

	public abstract void reset();
	
	public abstract boolean isEmpty();

}
