# JPA (Java Persistence API) - Conceitos Principais

## O que é JPA?
JPA (Java Persistence API) é uma especificação do Java que facilita o gerenciamento de dados relacionais em aplicações Java. É uma tecnologia que permite:
- Mapear objetos Java para tabelas do banco de dados (ORM - Object-Relational Mapping)
- Gerenciar dados de forma mais simples usando objetos Java
- Reduzir a quantidade de código necessário para interagir com o banco de dados

## Principais Conceitos

### 1. Entity
- São classes Java que representam tabelas no banco de dados
- Anotadas com `@Entity`
- Cada instância representa uma linha na tabela

### 2. Object-Relational Mapping (ORM)
- Técnica que converte dados entre banco de dados relacional e objetos Java
- Utiliza anotações para definir o mapeamento
- Principais anotações:
  - `@Table` - Define o nome da tabela
  - `@Column` - Define as colunas
  - `@Id` - Define a chave primária

### 3. EntityManager
- Interface principal para interagir com o contexto de persistência
- Gerencia o ciclo de vida das entidades
- Operações principais:
  - persist() - Salvar
  - merge() - Atualizar
  - remove() - Excluir
  - find() - Buscar

### 4. Relacionamentos
- `@OneToOne` - Relacionamento um para um
- `@OneToMany` - Relacionamento um para muitos
- `@ManyToOne` - Relacionamento muitos para um
- `@ManyToMany` - Relacionamento muitos para muitos

## Vantagens do JPA
1. Produtividade aumentada
2. Código mais limpo e manutenível
3. Independência de banco de dados
4. Fácil integração com frameworks como Spring

## Exemplo Básico de Uma Entidade
```java
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "email")
    private String email;
    
    // Getters e Setters
}
```

## Próximos Passos
1. Praticar criando entidades simples
2. Explorar diferentes tipos de relacionamentos
3. Aprender sobre consultas JPQL
4. Estudar sobre ciclo de vida das entidades

Lembre-se: O JPA é uma ferramenta poderosa que simplifica muito o trabalho com banco de dados em Java!