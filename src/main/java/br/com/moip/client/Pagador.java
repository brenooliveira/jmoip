package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Pagador {

	@XStreamAlias("Nome")
	private String nome;

	@XStreamAlias("LoginMoIP")
	private String loginMoIP;

	@XStreamAlias("Email")
	private String email;

	@XStreamAlias("TelefoneCelular")
	private String telefoneCelular;

	@XStreamAlias("Apelido")
	private String apelido;

	@XStreamAlias("Identidade")
	private String identidade;

	@XStreamAlias("EnderecoCobranca")
	private EnderecoCobranca enderecoCobranca;

	public Pagador comNome(final String nome) {
		this.nome = nome;
		return this;
	}

	public Pagador comEmail(final String email) {
		this.email = email;
		return this;
	}

	public Pagador comTelefoneCelular(final String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
		return this;
	}

	public Pagador comApelido(final String apelido) {
		this.apelido = apelido;
		return this;
	}

	public Pagador comIdentidade(final String identidade) {
		this.identidade = identidade;
		return this;
	}

	public Pagador comEnderecoCobranca(final EnderecoCobranca enderecoCobranca) {
		this.enderecoCobranca = enderecoCobranca;
		return this;
	}
}
