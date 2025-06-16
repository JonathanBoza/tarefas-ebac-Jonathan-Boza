package br.com.jeb.observer;

public class Demo {

    public static void main(String[] args) {
        Jornalista jor = new Jornalista();
        jor.add(new TV());
        jor.notifyAll("Aconteceu um acidente na BR-101");
    }
}
