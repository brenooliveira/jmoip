package br.com.moip.client;

public class EnderecoCobranca {
	private String Logradouro;
	private String Numero;
	private String Complemento;
	private String Bairro;
	private String Cidade;
	private String Estado;
	private String Pais;
	private String CEP;
	private String TelefoneFixo;

	public EnderecoCobranca comLogradouro(final String logradouro) {
		this.Logradouro = logradouro;
		return this;
	}

	public EnderecoCobranca comNumero(final String numero) {
		this.Numero = numero;
		return this;
	}

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(final String logradouro) {
		Logradouro = logradouro;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(final String numero) {
		Numero = numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(final String complemento) {
		Complemento = complemento;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(final String bairro) {
		Bairro = bairro;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(final String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(final String estado) {
		Estado = estado;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(final String pais) {
		Pais = pais;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(final String cEP) {
		CEP = cEP;
	}

	public String getTelefoneFixo() {
		return TelefoneFixo;
	}

	public void setTelefoneFixo(final String telefoneFixo) {
		TelefoneFixo = telefoneFixo;
	}

}
