# Módulo 20 - Pesquisa: Interface Funcional

Projeto desenvolvido por **Jonathan Euzébio Boza** como parte do curso de Java da EBAC.

## Pesquisa: Como identificar se uma interface é uma Interface Funcional?

**O que é uma Interface Funcional?**

Uma interface funcional em Java é uma interface que possui **apenas um único método abstrato**. 
Ela pode conter outros métodos "default" ou "static", mas apenas **um método** deve ser obrigatoriamente implementado.

Interfaces funcionais são essenciais para o uso de **expressões lambda** e **streams** no Java.

**Como identificar uma Interface Funcional?**

- Deve possuir **somente um método abstrato**.
- Pode (opcionalmente) utilizar a anotação `@FunctionalInterface` para garantir que a interface siga a regra.
- Caso tente colocar mais de um método abstrato numa interface anotada como `@FunctionalInterface`, o compilador gerará erro.

**Exemplo de Interface Funcional:**

```java
@FunctionalInterface
public interface Operacao {
    int executar(int a, int b);
}
```

Nesta interface, o método `executar` é o único método abstrato, tornando a interface funcional.

---

**Jonathan Euzébio Boza**