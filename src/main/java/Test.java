import static br.com.moip.client.Boleto.boleto;
import static br.com.moip.client.CartaoCredito.cartaoCredito;
import static br.com.moip.client.EnderecoCobranca.enderecoCobranca;
import static br.com.moip.client.InstrucaoUnica.instrucaoUnica;
import static br.com.moip.client.Pagador.pagador;
import static br.com.moip.client.PagamentoDireto.pagamentoDireto;
import static br.com.moip.client.Valores.valores;

import java.util.UUID;

import br.com.moip.client.EnviarInstrucao;
import br.com.moip.client.response.EnviarInstrucaoUnicaResponse;
import br.com.moip.client.send.SandboxMoip;
import br.com.moip.client.send.SendToMoip;

public class Test {

	public static void main(final String[] args) {

		EnviarInstrucao enviarInstrucao = new EnviarInstrucao()
				.comInstrucaoUnica(instrucaoUnica()
						.comRazao("Uma motivo pela compra")
						.comIdProprio(UUID.randomUUID().toString())
						.com(pagador()
								.comNome("Breno Oliveira")
								.comEmail("breno26@gmail.com")
								.comIdentidade("222.222.222-22")
								.comTelefoneCelular("(61)9999-9999")
								.comEnderecoCobranca(
										enderecoCobranca()
												.comLogradouro("Rua Vergueiro")
												.comNumero("853")
												.comBairro("Vila Mariano")
												.comCep("04600-021")
												.comCidade("Sao Paulo")
												.comEstado("SP")
												.comPais("BRA")
												.comTelefoneFixo(
														"(22)2222-2222")))
						.com(pagamentoDireto().comForma("BoletoBancario"))
						.com(boleto().comDiasParaExpiracao("5"))
						.com(valores().comValor("15.00"))
						.com(cartaoCredito().comNumero("4551870000000183")
								.comExpiracao("12/12")));

		SendToMoip sendToMoip = new SandboxMoip("SEU_TOKEN", "SUA_KEY");
		EnviarInstrucaoUnicaResponse response = sendToMoip
				.send(enviarInstrucao);

		System.out.println(response);

	}
}
