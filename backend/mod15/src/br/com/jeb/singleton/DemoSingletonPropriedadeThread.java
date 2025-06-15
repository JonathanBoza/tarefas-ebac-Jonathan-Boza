package br.com.jeb.singleton;

public class DemoSingletonPropriedadeThread {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());
        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Teste");
            System.out.println(singletonPropriedade.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropriedade singletonPropriedade = SingletonPropriedade.getInstance("Teste1");
            System.out.println(singletonPropriedade.getValue());
        }
    }
}
