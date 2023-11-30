package br.unicap.p2.assincrona01;

// Arquivo: GerenciamentoDados.java
import java.util.List;

public interface GerenciamentoDados {
    void adicionar(Object obj);
    void remover(long id);
    Object buscarPorId(long id);
    List<Object> listarTodos();
}
