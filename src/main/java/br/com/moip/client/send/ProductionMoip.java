package br.com.moip.client.send;

public class ProductionMoip extends SendToMoip {

	public ProductionMoip() {
	}

	public ProductionMoip(final String token, final String key) {
		super(token, key);
	}

	@Override
	public String getEnviroment() {
		return "https://www.moip.com.br/ws/alpha/EnviarInstrucao/Unica";
	}

}
