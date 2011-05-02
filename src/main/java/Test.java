import static br.com.moip.client.Boleto.boleto;
import static br.com.moip.client.CartaoCredito.cartaoCredito;
import static br.com.moip.client.EnderecoCobranca.enderecoCobranca;
import static br.com.moip.client.InstrucaoUnica.instrucaoUnica;
import static br.com.moip.client.Pagador.pagador;
import static br.com.moip.client.PagamentoDireto.pagamentoDireto;
import static br.com.moip.client.Valores.valores;

import java.util.UUID;

import br.com.moip.client.EnviarInstrucao;
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
												.comLogradouro("Rua Sócrates")
												.comNumero("853")
												.comBairro("Jardim Marajoara")
												.comCep("04671-072")
												.comCidade("São Paulo")
												.comEstado("SP")
												.comPais("BRA")
												.comTelefoneFixo(
														"(22)2222-2222")))
						.com(pagamentoDireto().comForma("BoletoBancario"))
						.com(boleto().comDiasParaExpiracao("5"))
						.com(valores().comValor("15.00"))
						.com(cartaoCredito().comNumero("324165156465546546")
								.comExpiracao("12/12")));

		SendToMoip sendToMoip = new SandboxMoip("1L0UKNMHBPD9PDBY2DLRZYQBID1L3D7I",
				"Z35XRKKSXHYZWAHJW5W9DEYEOPZ39NUODRUKBJKO");
		sendToMoip.send(enviarInstrucao);
	}
}
