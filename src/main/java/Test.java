import br.com.moip.client.Boleto;
import br.com.moip.client.EnderecoCobranca;
import br.com.moip.client.InstrucaoUnica;
import br.com.moip.client.Pagador;
import br.com.moip.client.PagamentoDireto;
import br.com.moip.client.Valores;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Test {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		Valores valores = new Valores().comValor("12.00");

		Boleto boleto = new Boleto().comDiasParaExpiracao("5");

		PagamentoDireto pagamentoDireto = new PagamentoDireto()
				.comForma("BoletoBancario");

		EnderecoCobranca enderecoCobranca = new EnderecoCobranca()
				.comLogradouro("Rua Sócrates").comNumero("853");

		Pagador pagador = new Pagador().comNome("Breno Oliveira")
				.comEmail("breno26@gmail.com").comIdentidade("222.222.222-22")
				.comTelefoneCelular("(61)9999-9999")
				.comEnderecoCobranca(enderecoCobranca);

		InstrucaoUnica instrucaoUnica = new InstrucaoUnica()
				.comRazao("qualquer").comIdProprio("6546454")
				.comPagador(pagador).comPagamentoDireto(pagamentoDireto)
				.comBoleto(boleto).comValores(valores);

		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(InstrucaoUnica.class);

		System.out.println(xStream.toXML(instrucaoUnica));

		// String xml =
		// "<InstrucaoUnica> <Razao>qualquer</Razao>  <IdProprio>6546454</IdProprio>  <Pagador>    <Nome>Breno Oliveira</Nome>    <Email>breno26@gmail.com</Email>  </Pagador></InstrucaoUnica>";
		//
		// InstrucaoUnica iu = (InstrucaoUnica) xStream.fromXML(xml,
		// InstrucaoUnica.class);
		// System.out.println(iu.getPagador());
	}
}
