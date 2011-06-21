import static br.com.moip.client.Boleto.boleto;
import static br.com.moip.client.CartaoCredito.cartaoCredito;
import static br.com.moip.client.Comissionado.comissionado;
import static br.com.moip.client.Comissionamento.comissionamento;
import static br.com.moip.client.Comissoes.comissoes;
import static br.com.moip.client.Endereco.enderecoCobranca;
import static br.com.moip.client.InstrucaoUnica.instrucaoUnica;
import static br.com.moip.client.Pagador.pagador;
import static br.com.moip.client.PagamentoDireto.pagamentoDireto;
import static br.com.moip.client.Portador.portador;
import static br.com.moip.client.Recebedor.recebedor;
import static br.com.moip.client.Valores.valores;
import br.com.moip.client.EnviarInstrucao;

public class Test {

	public static void main(final String[] args) {

		EnviarInstrucao enviarInstrucao = new EnviarInstrucao()
				.comInstrucaoUnica(instrucaoUnica()
						.comRazao("Uma motivo pela compra")
						.comIdProprio("teste")
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
						.com(pagamentoDireto()
								.comForma("BoletoBancario")
								.comCartaoCredito(
										cartaoCredito()
												.comNumero("3456789012345640")
												.comExpiracao("08/11")
												.comCodigoSeguranca("123")
												.comPortador(
														portador()
																.comDataNascimento(
																		"12/12/2012")
																.comNome(
																		"Breno Oliveira")
																.comIdentidade(
																		"22222222222")
																.comTipoDocumento(
																		"cpf"))))
						.com(boleto().comDiasParaExpiracao("5"))
						.com(valores().comValor("15.00"))
						.com(recebedor().comLoginMoip("teste"))
						.com(comissoes().comComissionamento(
								comissionamento()
										.comComissionado(
												comissionado().comissionado(
														"likestore"))
										.comValorPercentual("2")
										.comRazao("Percentual LikeStore"))));

		System.out.println(enviarInstrucao);

		// EnviarInstrucaoUnicaResponse response = new SandboxMoip().comHash(
		// "SEU_HASH").send(enviarInstrucao);
		//
		// System.out.println(response);

	}
}
