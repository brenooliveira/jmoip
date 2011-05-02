package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Valores {

	@XStreamAlias("Valor")
	private String valor;

	@XStreamAsAttribute
	private String moeda = "BRL";

	public static Valores valores() {
		return new Valores();
	}

	public Valores comValor(final String valor) {
		this.valor = valor;
		return this;
	}

	public Valores comTipoMoeda(final String moeda) {
		this.moeda = moeda;
		return this;
	}

}
