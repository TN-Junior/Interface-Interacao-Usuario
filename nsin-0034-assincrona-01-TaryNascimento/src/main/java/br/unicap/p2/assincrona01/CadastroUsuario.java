package br.unicap.p2.assincrona01;

// Arquivo: CadastroUsuario.java
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuario implements GerenciamentoDados {
    private List<Usuario> usuarios;

    public CadastroUsuario() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionar(Object obj) {
        if (obj instanceof Usuario) {
            usuarios.add((Usuario) obj);
            System.out.println("Usuário adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar usuário. Objeto inválido.");
        }
    }

    @Override
    public void remover(long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                usuarios.remove(usuario);
                System.out.println("Usuário removido com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado para remoção.");
    }

    @Override
    public Object buscarPorId(long id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        System.out.println("Usuário não encontrado.");
        return null;
    }

    @Override
    public List<Object> listarTodos() {
        List<Object> lista = new ArrayList<>(usuarios);
        if (lista.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        }
        return lista;
    }
}

