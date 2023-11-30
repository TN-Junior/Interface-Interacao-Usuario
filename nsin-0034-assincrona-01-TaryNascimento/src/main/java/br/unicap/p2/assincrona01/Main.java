package br.unicap.p2.assincrona01;

// Arquivo: Main.java
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cria instâncias de CadastroUsuario e Estoque
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        Estoque estoque = new Estoque();

        // Criação de objetos para teste
        Usuario usuario1 = new Usuario(1, "John Doe", "Usuário comum", new Date(), true, "john@example.com", "senha123");
        Usuario usuario2 = new Usuario(2, "Jane Smith", "Gerente de vendas", new Date(), true, "jane@example.com", "senha456");
        Produto produto1 = new Produto(1, "Produto A", "Descrição do Produto A", new Date(), true, 99.99, 50);
        Produto produto2 = new Produto(2, "Produto B", "Descrição do Produto B", new Date(), true, 149.99, 30);

        // Adicionando usuários e produtos aos respectivos gerenciadores
        cadastroUsuario.adicionar(usuario1);
        cadastroUsuario.adicionar(usuario2);
        estoque.adicionar(produto1);
        estoque.adicionar(produto2);

        // Exibindo todos os usuários cadastrados
        System.out.println("Lista de usuários:");
        List<Object> listaUsuarios = cadastroUsuario.listarTodos();
        for (Object obj : listaUsuarios) {
            Usuario usuario = (Usuario) obj;
            System.out.println(usuario.getDetalhes());
        }

        // Exibindo todos os produtos no estoque
        System.out.println("\nLista de produtos no estoque:");
        List<Object> listaProdutos = estoque.listarTodos();
        for (Object obj : listaProdutos) {
            Produto produto = (Produto) obj;
            System.out.println(produto.getDetalhes());
        }

        // Execução de operações de Compra e Venda (exemplo)
        List<Produto> produtosCompra = new ArrayList<>();
        produtosCompra.add(produto1);
        Compra compra = new Compra(1, "Compra", 199.99, new Date(), "Compra de produtos A e B", produtosCompra);
        compra.executarOperacao();

        List<Produto> produtosVenda = new ArrayList<>();
        produtosVenda.add(produto2);
        Venda venda = new Venda(2, "Venda", 149.99, new Date(), "Venda do produto B", produtosVenda);
        venda.executarOperacao();
    }
}
