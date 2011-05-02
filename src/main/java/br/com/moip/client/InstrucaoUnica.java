package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("InstrucaoUnica")
public class InstrucaoUnica {

	@XStreamAlias("Razao")
	private String razao;

	@XStreamAlias("IdProprio")
	private String IdProprio;

	@XStreamAlias("Pagador")
	private Pagador pagador;

	@XStreamAlias("PagamentoDireto")
	private PagamentoDireto pagamentoDireto;

	@XStreamAlias("Boleto")
	private Boleto boleto;

	@XStreamAlias("Valores")
	private Valores valores;

	@XStreamAlias("CartaoCredito")
	private CartaoCredito cartaoCredito;

	public static InstrucaoUnica instrucaoUnica() {
		return new InstrucaoUnica();
	}

	public InstrucaoUnica comRazao(final String razao) {
		this.razao = razao;
		return this;
	}

	public InstrucaoUnica comIdProprio(final String id) {
		this.IdProprio = id;
		return this;
	}

	public InstrucaoUnica com(final PagamentoDireto pagamentoDireto) {
		this.pagamentoDireto = pagamentoDireto;
		return this;
	}

	public InstrucaoUnica com(final Pagador pagador) {
		this.pagador = pagador;
		return this;
	}

	public InstrucaoUnica com(final Boleto boleto) {
		this.boleto = boleto;
		return this;
	}

	public InstrucaoUnica com(final Valores valores) {
		this.valores = valores;
		return this;
	}

	public CartaoCredito cartaoCredito() {
		if (cartaoCredito == null) {
			cartaoCredito = new CartaoCredito();
		}
		return cartaoCredito;
	}

	public InstrucaoUnica com(final CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
		return this;
	}

	public Pagador pagador() {
		if (pagador == null) {
			pagador = new Pagador();
		}
		return pagador;
	}

	public PagamentoDireto pagamentoDireto() {
		if (pagamentoDireto == null) {
			pagamentoDireto = new PagamentoDireto();
		}
		return pagamentoDireto;
	}

	public Boleto boleto() {
		if (boleto == null) {
			boleto = new Boleto();
		}
		return boleto;
	}

	public Valores valores() {
		if (valores == null) {
			valores = new Valores();
		}
		return valores;
	}

	public String getRazao() {
		return razao;
	}

	public String getIdProprio() {
		return IdProprio;
	}

	public Pagador getPagador() {
		return pagador;
	}

	public void setRazao(final String razao) {
		this.razao = razao;
	}

	public void setIdProprio(final String idProprio) {
		IdProprio = idProprio;
	}

	public void setPagador(final Pagador pagador) {
		this.pagador = pagador;
	}

}
