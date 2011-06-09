package br.com.moip.client.response;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class Resposta {

    @XStreamAlias("ID")
    private String id;

    @XStreamAlias("Status")
    private String status;

    @XStreamAlias("Token")
    private String token;

    @XStreamImplicit
    @XStreamAlias("Erro")
    private List<String> erro;

    @XStreamAlias("RespostaPagamentoDireto")
    private RespostaPagamentoDireto respostaPagamentoDireto;

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getToken() {
        return token;
    }

    public RespostaPagamentoDireto getRespostaPagamentoDireto() {
        return respostaPagamentoDireto;
    }

    public List<String> getErro() {
        return erro;
    }

    @Override
    public String toString() {
        return "Resposta [id=" + id + ", status=" + status + ", token=" + token + ", erro=" + erro + "]";
    }

}
