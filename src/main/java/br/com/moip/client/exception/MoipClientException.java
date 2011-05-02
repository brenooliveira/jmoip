package br.com.moip.client.exception;

public class MoipClientException extends RuntimeException {

	private static final long serialVersionUID = 4254719822440156101L;

	public MoipClientException() {
		super();
	}

	public MoipClientException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public MoipClientException(final String message) {
		super(message);
	}

	public MoipClientException(final Throwable cause) {
		super(cause);
	}

}
