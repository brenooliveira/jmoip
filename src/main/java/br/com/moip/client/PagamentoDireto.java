package br.com.moip.client;

public class PagamentoDireto {

	private String Forma;

	private String Instituicao;

	public static PagamentoDireto pagamentoDireto() {
		return new PagamentoDireto();
	}

	public PagamentoDireto comForma(final String forma) {
		this.Forma = forma;
		return this;
	}

	public PagamentoDireto comInstituicao(final String instituicao) {
		this.Instituicao = instituicao;
		return this;
	}

}
