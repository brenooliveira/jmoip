package br.com.moip.client.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ns1:EnviarInstrucaoUnicaResponse")
public class EnviarInstrucaoUnicaResponse {

	@XStreamAlias("Resposta")
	private Resposta resposta;

	public Resposta getResposta() {
		return resposta;
	}

	@Override
	public String toString() {
		return "EnviarInstrucaoUnicaResponse [resposta=" + resposta + "]";
	}

}
