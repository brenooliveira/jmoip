package br.com.moip.client.send;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

import br.com.moip.client.EnviarInstrucao;
import br.com.moip.client.exception.MoipClientException;
import br.com.moip.client.response.EnviarInstrucaoUnicaResponse;

import com.thoughtworks.xstream.XStream;

public abstract class SendToMoip {

	private String token;

	private String key;

	public SendToMoip(final String token, final String key) {
		this.token = token;
		this.key = key;
	}

	public EnviarInstrucaoUnicaResponse send(
			final EnviarInstrucao enviarInstrucao) {
		HttpClient client = new HttpClient();

		PostMethod post = new PostMethod(getEnviroment());

		String authHeader = token + ":" + key;
		String encoded = "Basic MUwwVUtOTUhCUEQ5UERCWTJETFJaWVFCSUQxTDNEN0k6WjM1WFJLS1NYSFlaV0FISlc1VzlERVlFT1BaMzlOVU9EUlVLQkpLTw==";

		post.setRequestHeader("Authorization", encoded);
		post.setDoAuthentication(true);

		XStream xstream = new XStream();
		xstream.processAnnotations(EnviarInstrucao.class);
		String body = xstream.toXML(enviarInstrucao);

		System.out.println(body);

		try {

			RequestEntity requestEntity = new StringRequestEntity(body,
					"application/x-www-formurlencoded", "UTF-8");
			post.setRequestEntity(requestEntity);

			int status = client.executeMethod(post);

			xstream.processAnnotations(EnviarInstrucaoUnicaResponse.class);

			return (EnviarInstrucaoUnicaResponse) xstream.fromXML(post
					.getResponseBodyAsString());
		} catch (Exception e) {

			throw new MoipClientException(e);
		} finally {

			post.releaseConnection();
		}
	}

	public abstract String getEnviroment();
}
