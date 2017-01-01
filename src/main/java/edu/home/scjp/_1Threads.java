package edu.home.scjp;

public class _1Threads
        implements Runnable {

    public static void main(String[] args) {
        Thread t = new Thread(new _1Threads());
        t.start();
        System.out.println("End of method.");

    }

    @Override
    public void run() {
        System.out.println("run.");
        throw new RuntimeException("Problem");

    }

}
