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

	public String getForma() {
		return Forma;
	}

	public void setForma(final String forma) {
		Forma = forma;
	}

	public String getInstituicao() {
		return Instituicao;
	}

	public void setInstituicao(final String instituicao) {
		Instituicao = instituicao;
	}

}
