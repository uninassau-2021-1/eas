package com.rafdev.fpdd.domain.dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import com.rafdev.fpdd.constants.ConstantMessagesErro;
import com.rafdev.fpdd.domain.dtos.model.AbstractBackingDTO;
import com.rafdev.fpdd.domain.entities.Usuario;
import com.rafdev.fpdd.domain.enums.IdiomaEnum;
import com.rafdev.fpdd.domain.enums.SimNaoEnum;

public class UsuarioDTO extends AbstractBackingDTO<Usuario, Long> {
	private static final long serialVersionUID = 1L;

	private Long id;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String login;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String email;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String senha;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String nome;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String sobrenome;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private String apelido;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private LocalDate dataNascimento;

	private String telefone;

	private String celular;

	private String pais;

	private String endereco;

	private String numeroEndereco;

	private String bairro;

	private String cidade;

	private String estado;

	private String cep;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private IdiomaEnum idioma;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SimNaoEnum premium;

	private LocalDateTime dataInicioPremium;

	private LocalDateTime dataFimPremium;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SimNaoEnum emailVerificado;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private SimNaoEnum tipoUsuario;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private LocalDateTime dataVerificacaoEmail;

	@NotEmpty(message = ConstantMessagesErro.CAMPO_NAO_PODE_SER_NULO)
	private LocalDateTime dataCadastro;

	public UsuarioDTO() {
		super();
	}

	public UsuarioDTO(Long id, String login, String email, String senha, String nome, String sobrenome, String apelido,
			LocalDate dataNascimento, String telefone, String celular, String pais, String endereco,
			String numeroEndereco, String bairro, String cidade, String estado, String cep, IdiomaEnum idioma,
			SimNaoEnum premium, LocalDateTime dataInicioPremium, LocalDateTime dataFimPremium,
			SimNaoEnum emailVerificado, SimNaoEnum tipoUsuario, LocalDateTime dataVerificacaoEmail,
			LocalDateTime dataCadastro) {
		super();
		this.id = id;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.celular = celular;
		this.pais = pais;
		this.endereco = endereco;
		this.numeroEndereco = numeroEndereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.idioma = idioma;
		this.premium = premium;
		this.dataInicioPremium = dataInicioPremium;
		this.dataFimPremium = dataFimPremium;
		this.emailVerificado = emailVerificado;
		this.tipoUsuario = tipoUsuario;
		this.dataVerificacaoEmail = dataVerificacaoEmail;
		this.dataCadastro = dataCadastro;
	}

	public UsuarioDTO(Usuario obj) {
		super();
		this.id = obj.getId();
		this.login = obj.getLogin();
		this.email = obj.getEmail();
		this.senha = obj.getSenha();
		this.nome = obj.getNome();
		this.sobrenome = obj.getSobrenome();
		this.apelido = obj.getApelido();
		this.dataNascimento = obj.getDataNascimento();
		this.telefone = obj.getTelefone();
		this.celular = obj.getCelular();
		this.pais = obj.getPais();
		this.endereco = obj.getEndereco();
		this.numeroEndereco = obj.getNumeroEndereco();
		this.bairro = obj.getBairro();
		this.cidade = obj.getCidade();
		this.estado = obj.getEstado();
		this.cep = obj.getCep();
		this.idioma = obj.getIdioma();
		this.premium = obj.getPremium();
		this.dataInicioPremium = obj.getDataInicioPremium();
		this.dataFimPremium = obj.getDataFimPremium();
		this.emailVerificado = obj.getEmailVerificado();
		this.tipoUsuario = obj.getTipoUsuario();
		this.dataVerificacaoEmail = obj.getDataVerificacaoEmail();
		this.dataCadastro = obj.getDataCadastro();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public IdiomaEnum getIdioma() {
		return idioma;
	}

	public void setIdioma(IdiomaEnum idioma) {
		this.idioma = idioma;
	}

	public SimNaoEnum getPremium() {
		return premium;
	}

	public void setPremium(SimNaoEnum premium) {
		this.premium = premium;
	}

	public LocalDateTime getDataInicioPremium() {
		return dataInicioPremium;
	}

	public void setDataInicioPremium(LocalDateTime dataInicioPremium) {
		this.dataInicioPremium = dataInicioPremium;
	}

	public LocalDateTime getDataFimPremium() {
		return dataFimPremium;
	}

	public void setDataFimPremium(LocalDateTime dataFimPremium) {
		this.dataFimPremium = dataFimPremium;
	}

	public SimNaoEnum getEmailVerificado() {
		return emailVerificado;
	}

	public void setEmailVerificado(SimNaoEnum emailVerificado) {
		this.emailVerificado = emailVerificado;
	}

	public SimNaoEnum getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(SimNaoEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public LocalDateTime getDataVerificacaoEmail() {
		return dataVerificacaoEmail;
	}

	public void setDataVerificacaoEmail(LocalDateTime dataVerificacaoEmail) {
		this.dataVerificacaoEmail = dataVerificacaoEmail;
	}

	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Usuario toEntity() {
		return new Usuario(this);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioDTO other = (UsuarioDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UsuarioDTO [id=" + id + ", login=" + login + ", email=" + email + ", senha=" + senha + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", celular=" + celular + ", pais=" + pais + ", endereco=" + endereco
				+ ", numeroEndereco=" + numeroEndereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + ", idioma=" + idioma + ", premium=" + premium + ", dataInicioPremium="
				+ dataInicioPremium + ", dataFimPremium=" + dataFimPremium + ", emailVerificado=" + emailVerificado
				+ ", tipoUsuario=" + tipoUsuario + ", dataVerificacaoEmail=" + dataVerificacaoEmail + ", dataCadastro="
				+ dataCadastro + "]";
	}

}
