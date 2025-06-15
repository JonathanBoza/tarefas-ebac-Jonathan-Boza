package br.com.jeb.singleton;

public class DemoSingletonPropriedadeThreadSyncronized {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());
        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedadeSyncronized = SingletonPropriedadeSyncronized.getInstance("Teste");
            System.out.println(singletonPropriedadeSyncronized.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropriedadeSyncronized singletonPropriedadeSyncronized = SingletonPropriedadeSyncronized.getInstance("Teste1");
            System.out.println(singletonPropriedadeSyncronized.getValue());
        }
    }
}
