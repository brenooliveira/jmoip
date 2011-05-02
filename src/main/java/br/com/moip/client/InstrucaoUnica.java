package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("InstrucaoUnica")
public class InstrucaoUnica {

	@XStreamAlias("Razao")
	private String Razao;

	private String IdProprio;

	private Pagador Pagador;

	private PagamentoDireto PagamentoDireto;

	private Boleto Boleto;

	private Valores Valores;

	public InstrucaoUnica comRazao(final String razao) {
		this.Razao = razao;
		return this;
	}

	public InstrucaoUnica comIdProprio(final String id) {
		this.IdProprio = id;
		return this;
	}

	public InstrucaoUnica comPagamentoDireto(
			final PagamentoDireto pagamentoDireto) {
		this.PagamentoDireto = pagamentoDireto;
		return this;
	}

	public InstrucaoUnica comPagador(final Pagador pagador) {
		this.Pagador = pagador;
		return this;
	}

	public InstrucaoUnica comBoleto(final Boleto boleto) {
		this.Boleto = boleto;
		return this;
	}

	public InstrucaoUnica comValores(final Valores valores) {
		this.Valores = valores;
		return this;
	}

	public String getRazao() {
		return Razao;
	}

	public String getIdProprio() {
		return IdProprio;
	}

	public Pagador getPagador() {
		return Pagador;
	}

	public void setRazao(final String razao) {
		Razao = razao;
	}

	public void setIdProprio(final String idProprio) {
		IdProprio = idProprio;
	}

	public void setPagador(final Pagador pagador) {
		Pagador = pagador;
	}

}
