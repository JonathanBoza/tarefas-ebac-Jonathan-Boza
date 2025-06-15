package br.com.jeb.singleton;

public class DemoSingletonPropriedade {

    public static void main(String args[]) {
        SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Teste");
        SingletonPropriedade singletonPropriedade1 = SingletonPropriedade.getInstance("Teste");

        System.out.println(singletonPropriedade.getValue());
        System.out.println(singletonPropriedade1.getValue());
    }
}
