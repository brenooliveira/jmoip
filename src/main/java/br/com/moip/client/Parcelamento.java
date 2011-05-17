package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Parcelamento {

	@XStreamAlias("Parcelas")
	private String parcelas;

	@XStreamAlias("Recebimento")
	private String recebimento;

	public static Parcelamento parcelamento() {
		return new Parcelamento();
	}

	public Parcelamento comNumeroParcelas(final String parcelas) {
		this.parcelas = parcelas;
		return this;
	}

	public Parcelamento comRecebimento(final String recebimento) {
		this.recebimento = recebimento;
		return this;
	}

	public String getParcelas() {
		return parcelas;
	}

	public void setParcelas(final String parcelas) {
		this.parcelas = parcelas;
	}

	public String getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(final String recebimento) {
		this.recebimento = recebimento;
	}

}
