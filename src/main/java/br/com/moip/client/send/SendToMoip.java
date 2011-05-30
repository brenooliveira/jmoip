package br.com.moip.client.send;

import org.apache.commons.codec.binary.Base64;
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

	private String hash;

	public SendToMoip() {
	}

	public SendToMoip(final String token, final String key) {
		this.token = token;
		this.key = key;
	}

	public EnviarInstrucaoUnicaResponse send(
			final EnviarInstrucao enviarInstrucao) {
		HttpClient client = new HttpClient();

		PostMethod post = new PostMethod(getEnviroment());

		String authHeader = token + ":" + key;
		String hash = this.hash;
		if (hasHash()) {
			hash = Base64.encodeBase64(authHeader.getBytes()).toString();
		}
		String encoded = "Basic " + hash;

		post.setRequestHeader("Authorization", encoded);
		post.setDoAuthentication(true);

		XStream xstream = new XStream();
		xstream.processAnnotations(EnviarInstrucao.class);
		String body = xstream.toXML(enviarInstrucao);

		try {

			RequestEntity requestEntity = new StringRequestEntity(body,
					"application/x-www-formurlencoded", "UTF-8");
			post.setRequestEntity(requestEntity);

			int status = client.executeMethod(post);
			System.out.println(status);

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

	private boolean hasHash() {
		return hash == null || "".equals(hash);
	}

	public SendToMoip comToken(final String token) {
		this.token = token;
		return this;
	}

	public SendToMoip comKey(final String key) {
		this.key = key;
		return this;
	}

	public SendToMoip comHash(final String hash) {
		this.hash = hash;
		return this;
	}

	public void setToken(final String token) {
		this.token = token;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public void setHash(final String hash) {
		this.hash = hash;
	}

}
