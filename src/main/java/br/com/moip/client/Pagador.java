package br.com.moip.client;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Pagador {

    @XStreamAlias("Nome")
    private String nome;

    @XStreamAlias("LoginMoIP")
    private String loginMoIP;

    @XStreamAlias("Email")
    private String email;

    @XStreamAlias("TelefoneCelular")
    private String telefoneCelular;

    @XStreamAlias("Apelido")
    private String apelido;

    @XStreamAlias("Identidade")
    private String identidade;

    @XStreamAlias("EnderecoCobranca")
    private Endereco enderecoCobranca;

    @XStreamAlias("EnderecoEntrega")
    private Endereco enderecoEntrega;

    public static Pagador pagador() {
        return new Pagador();
    }

    public Pagador comNome(final String nome) {
        this.nome = nome;
        return this;
    }

    public Pagador comEmail(final String email) {
        this.email = email;
        return this;
    }

    public Pagador comTelefoneCelular(final String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
        return this;
    }

    public Pagador comApelido(final String apelido) {
        this.apelido = apelido;
        return this;
    }

    public Pagador comIdentidade(final String identidade) {
        this.identidade = identidade;
        return this;
    }

    public Pagador comEnderecoCobranca(final Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
        return this;
    }

    public Pagador comEnderecoEntrega(final Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getLoginMoIP() {
        return loginMoIP;
    }

    public void setLoginMoIP(final String loginMoIP) {
        this.loginMoIP = loginMoIP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(final String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(final String apelido) {
        this.apelido = apelido;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(final String identidade) {
        this.identidade = identidade;
    }

    public Endereco getEnderecoCobranca() {
        return enderecoCobranca;
    }

    public void setEnderecoCobranca(final Endereco enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(final Endereco enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

}
