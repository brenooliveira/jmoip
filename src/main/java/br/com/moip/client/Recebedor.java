package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Recebedor {

	@XStreamAlias("LoginMoIP")
	private String loginMoIP;

	@XStreamAlias("Apelido")
	private String apelido;

	public static Recebedor recebedor() {
		return new Recebedor();
	}

	public Recebedor comLoginMoip(final String loginMoIP) {
		this.loginMoIP = loginMoIP;
		return this;
	}

	public Recebedor comApelido(final String apelido) {
		this.apelido = apelido;
		return this;
	}

	public String getLoginMoIP() {
		return loginMoIP;
	}

	public void setLoginMoIP(final String loginMoIP) {
		this.loginMoIP = loginMoIP;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(final String apelido) {
		this.apelido = apelido;
	}

}
