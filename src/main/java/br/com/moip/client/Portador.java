package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Portador {

	@XStreamAlias("Nome")
	private String nome;

	@XStreamAlias("Identidade")
	private String identidade;

	@XStreamAsAttribute
	@XStreamAlias("Tipo")
	private String tipoDocumento = "CPF";

	@XStreamAlias("Telefone")
	private String telefone;

	@XStreamAlias("DataNascimento")
	private String dataNascimento;

	public Portador comNome(final String nome) {
		this.nome = nome;
		return this;
	}

	public Portador comIdentidade(final String identidade) {
		this.identidade = identidade;
		return this;
	}

	public Portador comTipoDocumento(final String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
		return this;
	}

	public Portador comTelefone(final String telefone) {
		this.telefone = telefone;
		return this;
	}

	public Portador comDataNascimento(final String dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}
}
