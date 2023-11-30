package br.unicap.p2.assincrona01;

// Arquivo: InteracaoUsuario.java
public interface InteracaoUsuario {
    void exibirMenu();
    void selecionarOpcao(int opcao);
    void mostrarResultado(String resultado);
    String lerEntradaUsuario();
}
