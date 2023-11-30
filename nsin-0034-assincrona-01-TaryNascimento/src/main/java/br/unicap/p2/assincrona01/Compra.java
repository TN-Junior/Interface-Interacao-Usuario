package br.unicap.p2.assincrona01;

// Arquivo: Compra.java
import java.util.Date;
import java.util.List;

public class Compra extends Operacao {
    private List<Produto> produtos;

    public Compra(long id, String tipo, double valor, Date dataOperacao, String observacao,
                  List<Produto> produtos) {
        super(id, tipo, valor, dataOperacao, observacao);
        this.produtos = produtos;
    }

    @Override
    public void executarOperacao() {
        // Implementação da execução da operação de Compra
        System.out.println("Executando operação de compra...");
    }
}
