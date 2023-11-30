package br.unicap.p2.assincrona01;

// Arquivo: Operacao.java
import java.util.Date;

public abstract class Operacao {
    private long id;
    private String tipo;
    private double valor;
    private Date dataOperacao;
    private String observacao;

    public Operacao(long id, String tipo, double valor, Date dataOperacao, String observacao) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
        this.dataOperacao = dataOperacao;
        this.observacao = observacao;
    }

    // Getters e setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public abstract void executarOperacao();
}

