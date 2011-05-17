package br.com.moip.client.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class RespostaPagamentoDireto {

	@XStreamAlias("TotalPago")
	private String totalPago;

	@XStreamAlias("TaxaMoIP")
	private String taxaMoIP;

	@XStreamAlias("Status")
	private String status;

	@XStreamAlias("CodigoMoIP")
	private String codigoMoIP;

	@XStreamAlias("Mensagem")
	private String mensagem;

	@XStreamAlias("CodigoRetorno")
	private String codigoRetorno;

	@XStreamAlias("CodigoAutorizacao")
	private String codigoAutorizacao;

	public String getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(final String totalPago) {
		this.totalPago = totalPago;
	}

	public String getTaxaMoIP() {
		return taxaMoIP;
	}

	public void setTaxaMoIP(final String taxaMoIP) {
		this.taxaMoIP = taxaMoIP;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getCodigoMoIP() {
		return codigoMoIP;
	}

	public void setCodigoMoIP(final String codigoMoIP) {
		this.codigoMoIP = codigoMoIP;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(final String mensagem) {
		this.mensagem = mensagem;
	}

	public String getCodigoRetorno() {
		return codigoRetorno;
	}

	public void setCodigoRetorno(final String codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}

	public String getCodigoAutorizacao() {
		return codigoAutorizacao;
	}

	public void setCodigoAutorizacao(final String codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}

	@Override
	public String toString() {
		return "RespostaPagamentoDireto [totalPago=" + totalPago
				+ ", taxaMoIP=" + taxaMoIP + ", status=" + status
				+ ", codigoMoIP=" + codigoMoIP + ", mensagem=" + mensagem
				+ ", codigoRetorno=" + codigoRetorno + "]";
	}

}
