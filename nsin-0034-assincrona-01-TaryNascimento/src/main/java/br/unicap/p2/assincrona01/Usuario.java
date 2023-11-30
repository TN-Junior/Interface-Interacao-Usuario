package br.unicap.p2.assincrona01;

// Arquivo: Usuario.java
import java.util.Date;

public class Usuario extends EntidadeBase {
    private String email;
    private String senha;

    public Usuario(long id, String nome, String descricao, Date dataCriacao, boolean ativo,
                   String email, String senha) {
        super(id, nome, descricao, dataCriacao, ativo);
        this.email = email;
        this.senha = senha;
    }

    // Getters, setters, sobrecarga, toString()
    // Implementação dos métodos necessários
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getDetalhes() {
        return "ID: " + getId() + ", Nome: " + getNome() + ", Descrição: " + getDescricao();
    }
}

