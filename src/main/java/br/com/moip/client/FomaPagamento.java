package br.com.moip.client;

public enum FomaPagamento {

	BOLETO_BANCARIO("BoletoBancario"), CARTAO_CREDIT("CartaoCredito"), DEBITO_BANCARIO(
			"DebitoBancario");

	private String value;

	FomaPagamento(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
