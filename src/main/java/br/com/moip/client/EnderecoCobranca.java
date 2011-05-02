package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class EnderecoCobranca {

	@XStreamAlias("Logradouro")
	private String logradouro;

	@XStreamAlias("Numero")
	private String numero;

	@XStreamAlias("Complemento")
	private String complemento;

	@XStreamAlias("Bairro")
	private String bairro;

	@XStreamAlias("Cidade")
	private String cidade;

	@XStreamAlias("Estado")
	private String estado;

	@XStreamAlias("Pais")
	private String pais;

	@XStreamAlias("CEP")
	private String cep;

	@XStreamAlias("TelefoneFixo")
	private String telefoneFixo;

	public static EnderecoCobranca enderecoCobranca() {
		return new EnderecoCobranca();
	}

	public EnderecoCobranca comLogradouro(final String logradouro) {
		this.logradouro = logradouro;
		return this;
	}

	public EnderecoCobranca comNumero(final String numero) {
		this.numero = numero;
		return this;
	}

	public EnderecoCobranca comComplemento(final String complemento) {
		this.complemento = complemento;
		return this;
	}

	public EnderecoCobranca comBairro(final String bairro) {
		this.bairro = bairro;
		return this;
	}

	public EnderecoCobranca comCidade(final String cidade) {
		this.cidade = cidade;
		return this;
	}

	public EnderecoCobranca comEstado(final String estado) {
		this.estado = estado;
		return this;
	}

	public EnderecoCobranca comPais(final String pais) {
		this.pais = pais;
		return this;
	}

	public EnderecoCobranca comCep(final String cep) {
		this.cep = cep;
		return this;
	}

	public EnderecoCobranca comTelefoneFixo(final String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
		return this;
	}
}
