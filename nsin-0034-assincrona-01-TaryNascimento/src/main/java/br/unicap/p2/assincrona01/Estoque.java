package br.unicap.p2.assincrona01;

// Arquivo: Estoque.java
import java.util.ArrayList;
import java.util.List;

public class Estoque implements GerenciamentoDados {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    @Override
    public void adicionar(Object obj) {
        if (obj instanceof Produto) {
            produtos.add((Produto) obj);
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar produto. Objeto inválido.");
        }
    }

    @Override
    public void remover(long id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produtos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado para remoção.");
    }

    @Override
    public Object buscarPorId(long id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado.");
        return null;
    }

    @Override
    public List<Object> listarTodos() {
        List<Object> lista = new ArrayList<>(produtos);
        if (lista.isEmpty()) {
            System.out.println("Nenhum produto cadastrado no estoque.");
        }
        return lista;
    }
}

