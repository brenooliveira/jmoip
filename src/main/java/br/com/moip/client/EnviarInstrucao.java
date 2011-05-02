package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("EnviarInstrucao")
public class EnviarInstrucao {

	@XStreamAlias("InstrucaoUnica")
	private InstrucaoUnica instrucaoUnica;

	public InstrucaoUnica instrucaoUnica() {
		if (this.instrucaoUnica == null) {
			this.instrucaoUnica = new InstrucaoUnica();
		}
		return this.instrucaoUnica;
	}

	public EnviarInstrucao comInstrucaoUnica(final InstrucaoUnica instrucaoUnica) {
		this.instrucaoUnica = instrucaoUnica;
		return this;
	}
}
