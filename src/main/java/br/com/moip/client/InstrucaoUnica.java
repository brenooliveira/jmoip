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

	@XStreamAlias("URLNotificacao")
	private String urlNotificacao;

	@XStreamAlias("URLRetorno")
	private String urlRetorno;

	@XStreamAlias("Mensagens")
	private Mensagens mensagens;

	@XStreamAlias("Recebedor")
	private Recebedor recebedor;

	@XStreamAlias("Comissoes")
	private Comissoes comissoes;

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

	public InstrucaoUnica com(final Mensagens mensagens) {
		this.mensagens = mensagens;
		return this;
	}

	public InstrucaoUnica com(final Recebedor recebedor) {
		this.recebedor = recebedor;
		return this;
	}

	public InstrucaoUnica com(Comissoes comissoes) {
		this.comissoes = comissoes;
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

	public Recebedor recebedor() {
		if (recebedor == null) {
			recebedor = new Recebedor();
		}
		return recebedor;
	}

	public InstrucaoUnica comURLNotificacao(final String urlNotificacao) {
		this.urlNotificacao = urlNotificacao;
		return this;
	}

	public InstrucaoUnica comURLRetorno(final String urlRetorno) {
		this.urlRetorno = urlRetorno;
		return this;
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

	public PagamentoDireto getPagamentoDireto() {
		return pagamentoDireto;
	}

	public void setPagamentoDireto(final PagamentoDireto pagamentoDireto) {
		this.pagamentoDireto = pagamentoDireto;
	}

	public Boleto getBoleto() {
		return boleto;
	}

	public void setBoleto(final Boleto boleto) {
		this.boleto = boleto;
	}

	public Valores getValores() {
		return valores;
	}

	public void setValores(final Valores valores) {
		this.valores = valores;
	}

	public String getUrlNotificacao() {
		return urlNotificacao;
	}

	public void setUrlNotificacao(final String urlNotificacao) {
		this.urlNotificacao = urlNotificacao;
	}

	public String getUrlRetorno() {
		return urlRetorno;
	}

	public void setUrlRetorno(final String urlRetorno) {
		this.urlRetorno = urlRetorno;
	}

	public Mensagens getMensagens() {
		return mensagens;
	}

	public void setMensagens(final Mensagens mensagens) {
		this.mensagens = mensagens;
	}

	public Recebedor getRecebedor() {
		return recebedor;
	}

	public void setRecebedor(final Recebedor recebedor) {
		this.recebedor = recebedor;
	}

	public Comissoes getComissoes() {
		return comissoes;
	}

	public void setComissoes(Comissoes comissoes) {
		this.comissoes = comissoes;
	}

}
