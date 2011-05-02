package br.com.moip.client.send;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import br.com.moip.client.InstrucaoUnica;
import br.com.moip.client.exception.MoipClientException;

import com.thoughtworks.xstream.XStream;

public abstract class SendToMoip {

	private String token;

	private String key;

	public SendToMoip(final String token, final String key) {
		this.token = token;
		this.key = key;
	}

	public void send(final InstrucaoUnica instrucaoUnica) {
		HttpClient client = new HttpClient();

		PostMethod post = new PostMethod(getEnviroment());

		String token = "COLOQUE AQUI SUA CHAVE DE IDENTIFICACAO";
		String key = "COLOQUE AQUI SUA CHAVE DE PERMISSAO";
		String authHeader = token + ":" + key;
		String encoded = "Basic MUwwVUtOTUhCUEQ5UERCWTJETFJaWVFCSUQxTDNEN0k6WjM1WFJLS1NYSFlaV0FISlc1VzlERVlFT1BaMzlOVU9EUlVLQkpLTw==";

		post.setRequestHeader("Authorization", encoded);
		post.setDoAuthentication(true);

		XStream xstream = new XStream();
		xstream.processAnnotations(InstrucaoUnica.class);
		String body = xstream.toXML(instrucaoUnica);

		try {

			RequestEntity requestEntity = new StringRequestEntity(body,
					"application/x-www-formurlencoded", "UTF-8");
			post.setRequestEntity(requestEntity);

			int status = client.executeMethod(post);

			// System.out.println(status + "\n" +
			// post.getResponseBodyAsString());
		} catch (Exception e) {

			throw new MoipClientException(e);
		} finally {

			post.releaseConnection();
		}
	}

	public abstract String getEnviroment();
}
