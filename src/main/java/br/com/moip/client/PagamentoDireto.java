package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class PagamentoDireto {

	@XStreamAlias("Forma")
	private String forma;

	@XStreamAlias("Instituicao")
	private String instituicao;

	@XStreamAlias("CartaoCredito")
	private CartaoCredito cartaoCredito;

	@XStreamAlias("Parcelamento")
	private Parcelamento parcelamento;

	public static PagamentoDireto pagamentoDireto() {
		return new PagamentoDireto();
	}

	public PagamentoDireto comForma(final String forma) {
		this.forma = forma;
		return this;
	}

	public PagamentoDireto comInstituicao(final String instituicao) {
		this.instituicao = instituicao;
		return this;
	}

	public PagamentoDireto comCartaoCredito(final CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
		return this;
	}

	public PagamentoDireto comParcelamento(final Parcelamento parcelamento) {
		this.parcelamento = parcelamento;
		return this;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(final String forma) {
		this.forma = forma;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(final String instituicao) {
		this.instituicao = instituicao;
	}

	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(final CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public Parcelamento getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(final Parcelamento parcelamento) {
		this.parcelamento = parcelamento;
	}

}
