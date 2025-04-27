# Tarefa de Reflexão - Módulo 19

Projeto desenvolvido por **Jonathan Euzébio Boza** como parte do curso de Java da EBAC.

## Descrição

Neste projeto, foi criado:
- Uma anotação personalizada chamada `@Tabela`, que recebe um valor representando o nome de uma tabela.
- Uma classe `Cliente`, anotada com `@Tabela`, simulando um cadastro simples de cliente.
- Uma classe `Main` para realizar a leitura da anotação em tempo de execução utilizando **Reflection**.

## Estrutura do Projeto

- `Tabela.java` → Definição da anotação personalizada `@Tabela`.
- `Cliente.java` → Classe de modelo que utiliza a anotação `@Tabela`.
- `Main.java` → Leitura da anotação em tempo de execução e exibição no console.

## Tecnologias utilizadas

- Java 17
- VS Code

## Como executar

1. Clone o repositório.
2. Abra o projeto no Visual Studio Code.
3. Execute a classe `Main.java` para ver o nome da tabela impresso no console.

## Resultado esperado

Ao executar, o console mostrará:

```
Nome da tabela: clientes
```

---

**Jonathan Euzébio Boza**  
*Aluno EBAC - Curso de Java*
