package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Endereco {

    @XStreamAlias("Logradouro")
    private String logradouro;

    @XStreamAlias("Numero")
    private String numero;

    @XStreamAlias("Complemento")
    private String complemento;

    @XStreamAlias("Bairro")
    private String bairro;

    @XStreamAlias("Cidade")
    private String cidade;

    @XStreamAlias("Estado")
    private String estado;

    @XStreamAlias("Pais")
    private String pais;

    @XStreamAlias("CEP")
    private String cep;

    @XStreamAlias("TelefoneFixo")
    private String telefoneFixo;

    public static Endereco enderecoCobranca() {
        return new Endereco();
    }

    public static Endereco enderecoEntrega() {
        return new Endereco();
    }

    public Endereco comLogradouro(final String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public Endereco comNumero(final String numero) {
        this.numero = numero;
        return this;
    }

    public Endereco comComplemento(final String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Endereco comBairro(final String bairro) {
        this.bairro = bairro;
        return this;
    }

    public Endereco comCidade(final String cidade) {
        this.cidade = cidade;
        return this;
    }

    public Endereco comEstado(final String estado) {
        this.estado = estado;
        return this;
    }

    public Endereco comPais(final String pais) {
        this.pais = pais;
        return this;
    }

    public Endereco comCep(final String cep) {
        this.cep = cep;
        return this;
    }

    public Endereco comTelefoneFixo(final String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(final String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(final String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(final String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(final String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(final String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(final String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(final String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(final String cep) {
        this.cep = cep;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(final String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }
}
