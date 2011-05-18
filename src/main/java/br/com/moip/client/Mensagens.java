package br.com.moip.client;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("Mensagem")
public class Mensagens {

	@XStreamImplicit(itemFieldName = "Mensagem")
	@XStreamAlias("Mensagem")
	private List<String> mensagens;

	public static Mensagens mensagens() {
		return new Mensagens();
	}

	public Mensagens adicionaMensagem(final String mensagem) {

		if (this.mensagens == null) {
			this.mensagens = new ArrayList<String>();
		}
		mensagens.add(mensagem);
		return this;
	}

}
