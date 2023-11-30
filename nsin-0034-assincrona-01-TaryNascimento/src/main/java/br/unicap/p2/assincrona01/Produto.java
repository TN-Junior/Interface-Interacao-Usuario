package br.unicap.p2.assincrona01;

// Arquivo: Produto.java
import java.util.Date;

public class Produto extends EntidadeBase {
    private double preco;
    private int quantidadeEstoque;

    public Produto(long id, String nome, String descricao, Date dataCriacao, boolean ativo,
                   double preco, int quantidadeEstoque) {
        super(id, nome, descricao, dataCriacao, ativo);
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters, setters, toString()
    // Implementação dos métodos necessários
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String getDetalhes() {
        return "ID: " + getId() + ", Nome: " + getNome() + ", Descrição: " + getDescricao();
    }
}
