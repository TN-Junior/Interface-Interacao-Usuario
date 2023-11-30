[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zBVcYmxE)
# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: MSc. Iago Rodrigues

**Disciplina**: Programação Orientada a Objetos

**Atividade**: Atividade Assíncrona - Todos os assuntos

**Pontuação**: 2,00 pontos na média

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java 
> 2. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais)

## Descrição da Atividade

> Crie um sistema em Java com Programação Orientada a Objetos (POO) seguindo as especificações a seguir. 

> Interface **InteracaoUsuario**

Métodos:
- **void exibirMenu():** Exibe opções do menu.
- **void selecionarOpcao(int opcao):** Processa a seleção de opções.
- **void mostrarResultado(String resultado):** Exibe resultados.
- **String lerEntradaUsuario():** Lê a entrada do usuário.

> Interface **GerenciamentoDados**

Métodos:
- **void adicionar(Object obj):** Adiciona um novo objeto.
- **void remover(long id):** Remove um objeto pelo ID.
- **Object buscarPorId(long id):** Busca um objeto pelo ID.
- **List<< Object >> listarTodos():** Lista todos os objetos.


> Classe **EntidadeBase**:

Atributos:
- **long id**
- **String nome**
- **String descricao**
- **Date dataCriacao**
- **boolean ativo**

Métodos:
- Construtor, getters e setters
- Método abstrato **String getDetalhes():** Retorna detalhes da entidade.
- Classe Abstrata Operacao:

> Classe **Operacao**

Atributos:
- **long id**
- **String tipo**
- **double valor**
- **Date dataOperacao**
- **String observacao**

Métodos:
- Construtor, getters e setters
- Método abstrato **void executarOperacao():** Executa a operação.

> Classe Usuario (extends EntidadeBase):

Atributos: 
- **String email
- **String senha**

Métodos: 
- Construtor, getters e setters, sobrecarga, **toString()**

> Classe Produto (extends EntidadeBase):

Atributos: 
- **double preco**
- **int quantidadeEstoque**

Métodos: 
- Construtor, getters e setters, **toString()**

> Classe Compra (extends Operacao):
- Implementa executarOperacao()
- Associação 1-N com Produto

> Classe Venda (extends Operacao):
- Implementa executarOperacao()
- Associação 1-N com Produto

> Classe CadastroUsuario (implements GerenciamentoDados):
- Implementa todos os métodos da interface
- Associação 1-N com Usuario

> Classe Estoque (implements GerenciamentoDados):
- Implementa todos os métodos da interface
- Associação 1-N com Produto

> Classe Main:
- Contém main(String[] args)
- Cria instâncias das classes de gerenciamento (CadastroUsuario e Estoque)
- Implementa um loop de menu para gerenciamento (cadastro, remoção, listagem, etc.)