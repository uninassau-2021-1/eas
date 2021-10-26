package com.rafdev.fpdd.resources.model;

import com.rafdev.fpdd.exceptions.ClassNotInstantiableException;

public final class PageConfig {

	public static final String PAGE_ANTECEDENTE = "/antecedente";
	public static final String PAGE_CARACTERISTICA = "/caracteristica";
	public static final String PAGE_CLASSE = "/classe";
	public static final String PAGE_COR_CABELO = "/cor-cabelo";
	public static final String PAGE_COR_OLHOS = "/cor-olhos";
	public static final String PAGE_COR_PELE = "/cor-pele";
	public static final String PAGE_DEFEITO = "/defeito";
	public static final String PAGE_FICHA_JOGADOR = "/ficha-jogador";
	public static final String PAGE_IDEAL = "/ideal";
	public static final String PAGE_NOME_PERSONAGEM = "/nome-personagem";
	public static final String PAGE_RACA = "/raca";
	public static final String PAGE_SUB_CLASSE = "/sub-classe";
	public static final String PAGE_SUB_RACA_COR_CABELO = "/sub-raca-cor-cabelo";
	public static final String PAGE_SUB_RACA_COR_OLHOS = "/sub-raca-cor-olhos";
	public static final String PAGE_SUB_RACA_COR_PELE = "/sub-raca-cor-pele";
	public static final String PAGE_SUB_RACA_NOME_PERSONAGEM = "/sub-raca-nome-personagem";
	public static final String PAGE_SUB_RACA = "/sub-raca";
	public static final String PAGE_TENDENCIA_DEFEITO = "/tendencia-defeito";
	public static final String PAGE_TENDENCIA_IDEAL = "/tendencia-ideal";
	public static final String PAGE_TENDENCIA = "/tendencia";
	public static final String PAGE_TENDENCIA_TRACO = "/tendencia-traco";
	public static final String PAGE_TENDENCIA_VINCULO = "/tendencia-vinculo";
	public static final String PAGE_TRACO = "/traco";
	public static final String PAGE_USUARIO_FICHA_JOGADOR = "/usuario-ficha-jogador";
	public static final String PAGE_USUARIO = "/usuario";
	public static final String PAGE_VINCULO = "/vinculo";

	public static final String SEARCH = "/search";
	public static final String PAGINATOR = "/page";

	public static final String ID = "/{id}";

	private PageConfig() {
		throw new ClassNotInstantiableException(PageConfig.class);
	}

}
