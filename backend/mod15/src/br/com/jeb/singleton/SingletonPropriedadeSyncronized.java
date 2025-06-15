package br.com.jeb.singleton;

public class SingletonPropriedadeSyncronized {

    private static SingletonPropriedadeSyncronized singletonPropriedadeSyncronized;
    private String value;

    private SingletonPropriedadeSyncronized(String value) {
        this.value = value;
    }

    public static synchronized SingletonPropriedadeSyncronized getInstance(String value) {
        if (singletonPropriedadeSyncronized == null) {
            singletonPropriedadeSyncronized = new SingletonPropriedadeSyncronized(value);
        }
        return singletonPropriedadeSyncronized;
    }

    public String getValue() {
        return value;
    }
}
