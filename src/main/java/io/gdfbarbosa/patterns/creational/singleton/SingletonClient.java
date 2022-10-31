package io.gdfbarbosa.patterns.creational.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadBar = new Thread(new ThreadBar());
        Thread threadFoo = new Thread(new ThreadFoo());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            try {
                double waitTime = Math.random() * 1000;
                System.out.println(waitTime);
                Thread.sleep((int) waitTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            try {
                double waitTime = Math.random() * 1000;
                System.out.println(waitTime);
                Thread.sleep((int) waitTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }

}
