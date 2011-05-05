package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class CartaoCredito {

	@XStreamAlias("Numero")
	private String numero;

	@XStreamAlias("Expiracao")
	private String expiracao;

	@XStreamAlias("CodigoSeguranca")
	private String codigoSeguranca;

	@XStreamAlias("Portador")
	private Portador portador;

	public static CartaoCredito cartaoCredito() {
		return new CartaoCredito();
	}

	public CartaoCredito comNumero(final String numero) {
		this.numero = numero;
		return this;
	}

	public CartaoCredito comExpiracao(final String expiracao) {
		this.expiracao = expiracao;
		return this;
	}

	public CartaoCredito comPortador(final Portador portador) {
		this.portador = portador;
		return this;
	}

	public CartaoCredito comCodigoSeguranca(final String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
		return this;
	}

	public Portador portador() {
		if (this.portador == null) {
			this.portador = new Portador();
		}
		return this.portador;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(final String numero) {
		this.numero = numero;
	}

	public String getExpiracao() {
		return expiracao;
	}

	public void setExpiracao(final String expiracao) {
		this.expiracao = expiracao;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(final String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public Portador getPortador() {
		return portador;
	}

	public void setPortador(final Portador portador) {
		this.portador = portador;
	}

}
