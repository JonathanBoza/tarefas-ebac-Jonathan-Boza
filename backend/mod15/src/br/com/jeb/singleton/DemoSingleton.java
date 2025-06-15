package br.com.jeb.singleton;

public class DemoSingleton {

    public static void main(String args[]) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);
        System.out.println("Singleton instance1: " + singleton1);
    }
}
