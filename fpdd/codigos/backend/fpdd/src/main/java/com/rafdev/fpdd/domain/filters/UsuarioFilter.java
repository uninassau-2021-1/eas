package com.rafdev.fpdd.domain.filters;

import java.time.LocalDate;

import com.rafdev.fpdd.domain.entities.Usuario;
import com.rafdev.fpdd.domain.enums.IdiomaEnum;
import com.rafdev.fpdd.domain.enums.StatusEnum;
import com.rafdev.fpdd.domain.filters.model.AbstractBackingFilter;
import com.rafdev.fpdd.resources.utils.URLUtils;

public class UsuarioFilter extends AbstractBackingFilter<Usuario, Long> {

	private Long idEquals;

	private Long idNotEquals;

	private String loginLike;

	private String emailLike;

	private String nomeLike;

	private String sobrenomeLike;

	private String apelidoLike;

	private LocalDate dataNascimentoEquals;

	private String paisEquals;

	private String enderecoLike;

	private String numeroEnderecoLike;

	private String bairroLike;

	private String cidadeLike;

	private String estadoEquals;

	private String cepEquals;

	private String idiomaEquals;

	private Character premiumEquals;

	private LocalDate dataInicioPremiumEquals;

	private LocalDate dataFimPremiumEquals;

	private Character emailVerificadoEquals;

	private Character tipoUsuarioEquals;

	private LocalDate dataVerificacaoEmailEquals;

	private LocalDate dataCadastroEquals;

	public UsuarioFilter() {
		super();
	}

	public Long getIdEquals() {
		return idEquals;
	}

	public void setIdEquals(Long idEquals) {
		this.idEquals = idEquals;
	}

	public Long getIdNotEquals() {
		return idNotEquals;
	}

	public void setIdNotEquals(Long idNotEquals) {
		this.idNotEquals = idNotEquals;
	}

	public String getLoginLike() {
		return loginLike;
	}

	public void setLoginLike(String loginLike) {
		this.loginLike = loginLike;
	}

	public String getEmailLike() {
		return emailLike;
	}

	public void setEmailLike(String emailLike) {
		this.emailLike = emailLike;
	}

	public String getNomeLike() {
		return nomeLike;
	}

	public void setNomeLike(String nomeLike) {
		this.nomeLike = nomeLike;
	}

	public String getSobrenomeLike() {
		return sobrenomeLike;
	}

	public void setSobrenomeLike(String sobrenomeLike) {
		this.sobrenomeLike = sobrenomeLike;
	}

	public String getApelidoLike() {
		return apelidoLike;
	}

	public void setApelidoLike(String apelidoLike) {
		this.apelidoLike = apelidoLike;
	}

	public LocalDate getDataNascimentoEquals() {
		return dataNascimentoEquals;
	}

	public void setDataNascimentoEquals(LocalDate dataNascimentoEquals) {
		this.dataNascimentoEquals = dataNascimentoEquals;
	}

	public String getPaisEquals() {
		return paisEquals;
	}

	public void setPaisEquals(String paisEquals) {
		this.paisEquals = paisEquals;
	}

	public String getEnderecoLike() {
		return enderecoLike;
	}

	public void setEnderecoLike(String enderecoLike) {
		this.enderecoLike = enderecoLike;
	}

	public String getNumeroEnderecoLike() {
		return numeroEnderecoLike;
	}

	public void setNumeroEnderecoLike(String numeroEnderecoLike) {
		this.numeroEnderecoLike = numeroEnderecoLike;
	}

	public String getBairroLike() {
		return bairroLike;
	}

	public void setBairroLike(String bairroLike) {
		this.bairroLike = bairroLike;
	}

	public String getCidadeLike() {
		return cidadeLike;
	}

	public void setCidadeLike(String cidadeLike) {
		this.cidadeLike = cidadeLike;
	}

	public String getEstadoEquals() {
		return estadoEquals;
	}

	public void setEstadoEquals(String estadoEquals) {
		this.estadoEquals = estadoEquals;
	}

	public String getCepEquals() {
		return cepEquals;
	}

	public void setCepEquals(String cepEquals) {
		this.cepEquals = cepEquals;
	}

	public IdiomaEnum getIdiomaEquals() {
		return IdiomaEnum.toEnum(idiomaEquals);
	}

	public void setIdiomaEquals(IdiomaEnum idiomaEquals) {
		this.idiomaEquals = idiomaEquals == null ? null : idiomaEquals.getCodigo();
	}

	public StatusEnum getPremiumEquals() {
		return StatusEnum.toEnum(premiumEquals);
	}

	public void setPremiumEquals(StatusEnum premiumEquals) {
		this.premiumEquals = premiumEquals == null ? null : premiumEquals.getCodigo();
	}

	public LocalDate getDataInicioPremiumEquals() {
		return dataInicioPremiumEquals;
	}

	public void setDataInicioPremiumEquals(LocalDate dataInicioPremiumEquals) {
		this.dataInicioPremiumEquals = dataInicioPremiumEquals;
	}

	public LocalDate getDataFimPremiumEquals() {
		return dataFimPremiumEquals;
	}

	public void setDataFimPremiumEquals(LocalDate dataFimPremiumEquals) {
		this.dataFimPremiumEquals = dataFimPremiumEquals;
	}

	public StatusEnum getEmailVerificadoEquals() {
		return StatusEnum.toEnum(emailVerificadoEquals);
	}

	public void setEmailVerificadoEquals(StatusEnum emailVerificadoEquals) {
		this.emailVerificadoEquals = emailVerificadoEquals == null ? null : emailVerificadoEquals.getCodigo();
	}

	public StatusEnum getTipoUsuarioEquals() {
		return StatusEnum.toEnum(tipoUsuarioEquals);
	}

	public void setTipoUsuarioEquals(StatusEnum tipoUsuarioEquals) {
		this.tipoUsuarioEquals = tipoUsuarioEquals == null ? null : tipoUsuarioEquals.getCodigo();
	}

	public LocalDate getDataVerificacaoEmailEquals() {
		return dataVerificacaoEmailEquals;
	}

	public void setDataVerificacaoEmailEquals(LocalDate dataVerificacaoEmailEquals) {
		this.dataVerificacaoEmailEquals = dataVerificacaoEmailEquals;
	}

	public LocalDate getDataCadastroEquals() {
		return dataCadastroEquals;
	}

	public void setDataCadastroEquals(LocalDate dataCadastroEquals) {
		this.dataCadastroEquals = dataCadastroEquals;
	}

	@Override
	public void reset() {
		this.idEquals = null;
		this.idNotEquals = null;
		this.loginLike = null;
		this.emailLike = null;
		this.nomeLike = null;
		this.sobrenomeLike = null;
		this.apelidoLike = null;
		this.dataNascimentoEquals = null;
		this.paisEquals = null;
		this.enderecoLike = null;
		this.numeroEnderecoLike = null;
		this.bairroLike = null;
		this.cidadeLike = null;
		this.estadoEquals = null;
		this.cepEquals = null;
		this.idiomaEquals = null;
		this.premiumEquals = null;
		this.dataInicioPremiumEquals = null;
		this.dataFimPremiumEquals = null;
		this.emailVerificadoEquals = null;
		this.tipoUsuarioEquals = null;
		this.dataVerificacaoEmailEquals = null;
		this.dataCadastroEquals = null;
	}

	@Override
	public UsuarioFilter getFilterDecoded() {
		UsuarioFilter filter = new UsuarioFilter();

		filter.setIdEquals(getIdEquals());
		filter.setIdNotEquals(getIdNotEquals());
		filter.setLoginLike(URLUtils.decodeParam(getLoginLike()));
		filter.setEmailLike(URLUtils.decodeParam(getEmailLike()));
		filter.setNomeLike(URLUtils.decodeParam(getNomeLike()));
		filter.setSobrenomeLike(URLUtils.decodeParam(getSobrenomeLike()));
		filter.setApelidoLike(URLUtils.decodeParam(getApelidoLike()));
		filter.setDataNascimentoEquals(getDataNascimentoEquals());
		filter.setPaisEquals(URLUtils.decodeParam(getPaisEquals()));
		filter.setEnderecoLike(URLUtils.decodeParam(getEnderecoLike()));
		filter.setNumeroEnderecoLike(URLUtils.decodeParam(getNumeroEnderecoLike()));
		filter.setBairroLike(URLUtils.decodeParam(getBairroLike()));
		filter.setCidadeLike(URLUtils.decodeParam(getCidadeLike()));
		filter.setEstadoEquals(URLUtils.decodeParam(getEstadoEquals()));
		filter.setCepEquals(URLUtils.decodeParam(getCepEquals()));
		filter.setIdiomaEquals(getIdiomaEquals());
		filter.setPremiumEquals(getPremiumEquals());
		filter.setDataInicioPremiumEquals(getDataInicioPremiumEquals());
		filter.setDataFimPremiumEquals(getDataFimPremiumEquals());
		filter.setEmailVerificadoEquals(getEmailVerificadoEquals());
		filter.setTipoUsuarioEquals(getTipoUsuarioEquals());
		filter.setDataVerificacaoEmailEquals(getDataVerificacaoEmailEquals());
		filter.setDataCadastroEquals(getDataCadastroEquals());

		return filter;
	}

	@Override
	public boolean isEmpty() {
		return this.idEquals == null && this.idNotEquals == null && (this.loginLike == null || this.loginLike.isBlank())
				&& (this.emailLike == null || this.emailLike.isBlank())
				&& (this.nomeLike == null || this.nomeLike.isBlank())
				&& (this.sobrenomeLike == null || this.sobrenomeLike.isBlank())
				&& (this.apelidoLike == null || this.apelidoLike.isBlank()) && this.getDataNascimentoEquals() == null
				&& (this.paisEquals == null || this.paisEquals.isBlank())
				&& (this.enderecoLike == null || this.enderecoLike.isBlank())
				&& (this.numeroEnderecoLike == null || this.numeroEnderecoLike.isBlank())
				&& (this.bairroLike == null || this.bairroLike.isBlank())
				&& (this.cidadeLike == null || this.cidadeLike.isBlank())
				&& (this.estadoEquals == null || this.estadoEquals.isBlank())
				&& (this.cepEquals == null || this.cepEquals.isBlank())
				&& (this.idiomaEquals == null || this.idiomaEquals.isBlank()) && this.premiumEquals == null
				&& this.dataInicioPremiumEquals == null && this.dataFimPremiumEquals == null
				&& this.emailVerificadoEquals == null && this.tipoUsuarioEquals == null
				&& this.dataVerificacaoEmailEquals == null && dataCadastroEquals == null;
	}

	@Override
	public String toString() {
		return "UsuarioFilter [idEquals=" + idEquals + ", idNotEquals=" + idNotEquals + ", loginLike=" + loginLike
				+ ", emailLike=" + emailLike + ", nomeLike=" + nomeLike + ", sobrenomeLike=" + sobrenomeLike
				+ ", apelidoLike=" + apelidoLike + ", dataNascimentoEquals=" + dataNascimentoEquals + ", paisEquals="
				+ paisEquals + ", enderecoLike=" + enderecoLike + ", numeroEnderecoLike=" + numeroEnderecoLike
				+ ", bairroLike=" + bairroLike + ", cidadeLike=" + cidadeLike + ", estadoEquals=" + estadoEquals
				+ ", cepEquals=" + cepEquals + ", idiomaEquals=" + idiomaEquals + ", premiumEquals=" + premiumEquals
				+ ", dataInicioPremiumEquals=" + dataInicioPremiumEquals + ", dataFimPremiumEquals="
				+ dataFimPremiumEquals + ", emailVerificadoEquals=" + emailVerificadoEquals + ", tipoUsuarioEquals="
				+ tipoUsuarioEquals + ", dataVerificacaoEmailEquals=" + dataVerificacaoEmailEquals
				+ ", dataCadastroEquals=" + dataCadastroEquals + "]";
	}

}
