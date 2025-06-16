package br.com.jeb.templatemethod;

public class Policial extends Trabalhador {

    @Override
    protected void trabalhar() {
        System.out.println("Trabalhando como policial");
    }

    @Override
    protected void levantar() {
        System.out.println("Levantando da cama as 8h da manhã");
    }
}
