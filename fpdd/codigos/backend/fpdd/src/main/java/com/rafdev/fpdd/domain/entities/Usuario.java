package com.rafdev.fpdd.domain.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.rafdev.fpdd.domain.dtos.UsuarioDTO;
import com.rafdev.fpdd.domain.entities.model.AbstractBackingEntity;
import com.rafdev.fpdd.domain.enums.IdiomaEnum;
import com.rafdev.fpdd.domain.enums.SimNaoEnum;
import com.rafdev.fpdd.resources.utils.ColumnDefinitionTypes;

@Entity
@Table(name = Usuario.TABLE_NAME, schema = AbstractBackingEntity.SCHEMA_FPDD_NAME)
public class Usuario extends AbstractBackingEntity<Long> {
	private static final long serialVersionUID = 1L;

	public static final String TABLE_NAME = "TBUSUARIOFPDD";

	public static final String COLUMN_ID = "CUSUARCODIGO";
	public static final String COLUMN_LOGIN = "EUSUARLOGIN";
	public static final String COLUMN_EMAIL = "EUSUAREMAIL";
	public static final String COLUMN_SENHA = "EUSUARSENHA";
	public static final String COLUMN_NOME = "NUSUARNOME";
	public static final String COLUMN_SOBRENOME = "NUSUARSOBRENOME";
	public static final String COLUMN_APELIDO = "NUSUARAPELIDO";
	public static final String COLUMN_DATA_NASCIMENTO = "DUSUARNASCIMENTO";
	public static final String COLUMN_TELEFONE = "AUSUARTELEFONE";
	public static final String COLUMN_CELULAR = "AUSUARCELULAR";
	public static final String COLUMN_PAIS = "EUSUARPAIS";
	public static final String COLUMN_ENDERECO = "EUSUARENDERECO";
	public static final String COLUMN_NUMERO_ENDERECO = "AUSUARNUMEROENDERECO";
	public static final String COLUMN_BAIRRO = "EUSUARBAIRRO";
	public static final String COLUMN_CIDADE = "EUSUARCIDADE";
	public static final String COLUMN_UF = "EUSUARUF";
	public static final String COLUMN_CEP = "CUSUARCEP";
	public static final String COLUMN_IDIOMA = "FUSUARIDIOMA";
	public static final String COLUMN_PREMIUM = "FUSUARPREMIUM";
	public static final String COLUMN_DATA_INICIO_PREMIUM = "DUSUARINICIOPREMIUM";
	public static final String COLUMN_DATA_FIM_PREMIUM = "DUSUARFIMPREMIUM";
	public static final String COLUMN_EMAIL_VERIFICADO = "FUSUAREMAILVERIF";
	public static final String COLUMN_TIPO_USUARIO = "FUSUARTIPOUSUARIO";
	public static final String COLUMN_DATA_VERIFICACAO_EMAIL = "TUSUARDATAVERIFICACAOEMAIL";
	public static final String COLUMN_DATA_CADASTRO = "TUSUARDATACADASTRO";
	public static final String COLUMN_ULTIMA_ATUALIZACAO = "TUSUARULAT";

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = COLUMN_ID, columnDefinition = ColumnDefinitionTypes.BIGINT_UNSIGNED, precision = 255)
	private Long id;

	@NotNull
	@Column(name = COLUMN_LOGIN, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 50)
	private String login;

	@NotNull
	@Column(name = COLUMN_EMAIL, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String email;

	@NotNull
	@Column(name = COLUMN_SENHA, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 30)
	private String senha;

	@NotNull
	@Column(name = COLUMN_NOME, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 20)
	private String nome;

	@NotNull
	@Column(name = COLUMN_SOBRENOME, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 100)
	private String sobrenome;

	@NotNull
	@Column(name = COLUMN_APELIDO, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 50)
	private String apelido;

	@NotNull
	@Column(name = COLUMN_DATA_NASCIMENTO, columnDefinition = ColumnDefinitionTypes.DATE)
	private LocalDate dataNascimento;

	@Column(name = COLUMN_TELEFONE, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 15)
	private String telefone;

	@Column(name = COLUMN_CELULAR, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 15)
	private String celular;

	@Column(name = COLUMN_PAIS, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 30)
	private String pais;

	@Column(name = COLUMN_ENDERECO, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 150)
	private String endereco;

	@Column(name = COLUMN_NUMERO_ENDERECO, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 20)
	private String numeroEndereco;

	@Column(name = COLUMN_BAIRRO, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 50)
	private String bairro;

	@Column(name = COLUMN_CIDADE, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 50)
	private String cidade;

	@Column(name = COLUMN_UF, columnDefinition = ColumnDefinitionTypes.CHAR, length = 2)
	private String estado;

	@Column(name = COLUMN_CEP, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 20)
	private String cep;

	@NotNull
	@Column(name = COLUMN_IDIOMA, columnDefinition = ColumnDefinitionTypes.VARCHAR, length = 10)
	private String idioma;

	@NotNull
	@Column(name = COLUMN_PREMIUM, columnDefinition = ColumnDefinitionTypes.CHAR, length = 1)
	private Character premium;

	@Column(name = COLUMN_DATA_INICIO_PREMIUM, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime dataInicioPremium;

	@Column(name = COLUMN_DATA_FIM_PREMIUM, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime dataFimPremium;

	@NotNull
	@Column(name = COLUMN_EMAIL_VERIFICADO, columnDefinition = ColumnDefinitionTypes.CHAR, length = 1)
	private Character emailVerificado;

	@NotNull
	@Column(name = COLUMN_TIPO_USUARIO, columnDefinition = ColumnDefinitionTypes.CHAR, length = 1)
	private Character tipoUsuario;

	@NotNull
	@Column(name = COLUMN_DATA_VERIFICACAO_EMAIL, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime dataVerificacaoEmail;

	@NotNull
	@Column(name = COLUMN_DATA_CADASTRO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime dataCadastro;

	@NotNull
	@Column(name = COLUMN_ULTIMA_ATUALIZACAO, columnDefinition = ColumnDefinitionTypes.TIMESTAMP, precision = 6)
	private LocalDateTime ultimaAtualizacao;

	public Usuario() {
		super();
	}

	public Usuario(Long id, String login, String email, String senha, String nome, String sobrenome, String apelido,
			LocalDate dataNascimento, String telefone, String celular, String pais, String endereco,
			String numeroEndereco, String bairro, String cidade, String estado, String cep, String idioma,
			Character premium, LocalDateTime dataInicioPremium, LocalDateTime dataFimPremium, Character emailVerificado,
			Character tipoUsuario, LocalDateTime dataVerificacaoEmail, LocalDateTime dataCadastro) {
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

	public Usuario(UsuarioDTO obj) {
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
		this.idioma = obj.getIdioma().getCodigo();
		this.premium = obj.getPremium().getCodigo();
		this.dataInicioPremium = obj.getDataInicioPremium();
		this.dataFimPremium = obj.getDataFimPremium();
		this.emailVerificado = obj.getEmailVerificado().getCodigo();
		this.tipoUsuario = obj.getTipoUsuario().getCodigo();
		this.dataVerificacaoEmail = obj.getDataVerificacaoEmail();
		this.dataCadastro = obj.getDataCadastro();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
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
		return IdiomaEnum.toEnum(idioma);
	}

	public void setIdioma(IdiomaEnum idioma) {
		this.idioma = idioma == null ? null : idioma.getCodigo();
	}

	public SimNaoEnum getPremium() {
		return SimNaoEnum.toEnum(premium);
	}

	public void setPremium(SimNaoEnum premium) {
		this.premium = premium == null ? null : premium.getCodigo();
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
		return SimNaoEnum.toEnum(emailVerificado);
	}

	public void setEmailVerificado(SimNaoEnum emailVerificado) {
		this.emailVerificado = emailVerificado == null ? null : emailVerificado.getCodigo();
	}

	public SimNaoEnum getTipoUsuario() {
		return SimNaoEnum.toEnum(tipoUsuario);
	}

	public void setTipoUsuario(SimNaoEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario == null ? null : tipoUsuario.getCodigo();
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

	@Autowired
	public LocalDateTime getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	@Autowired
	public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}

	@Override
	@SuppressWarnings("unchecked")
	public UsuarioDTO toDto() {
		return new UsuarioDTO(this);
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
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", email=" + email + ", senha=" + senha + ", nome=" + nome
				+ ", sobrenome=" + sobrenome + ", apelido=" + apelido + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", celular=" + celular + ", pais=" + pais + ", endereco=" + endereco
				+ ", numeroEndereco=" + numeroEndereco + ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + ", idioma=" + idioma + ", premium=" + premium + ", dataInicioPremium="
				+ dataInicioPremium + ", dataFimPremium=" + dataFimPremium + ", emailVerificado=" + emailVerificado
				+ ", tipoUsuario=" + tipoUsuario + ", dataVerificacaoEmail=" + dataVerificacaoEmail + ", dataCadastro="
				+ dataCadastro + ", ultimaAtualizacao=" + ultimaAtualizacao + "]";
	}

}
