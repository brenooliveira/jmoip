package br.com.moip.client.send;

public class SandboxMoip extends SendToMoip {

	public SandboxMoip() {
	}

	public SandboxMoip(final String token, final String key) {
		super(token, key);
	}

	@Override
	public String getEnviroment() {
		return "https://desenvolvedor.moip.com.br/sandbox/ws/alpha/EnviarInstrucao/Unica";
	}

}
