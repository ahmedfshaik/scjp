package edu.home.scjp;

public class _4Starter
        extends Thread {

    private int x = 2;

    public _4Starter() {
        x = 5;
        start();
    }

    public void makeItSo() throws InterruptedException {
        join();
        x = x - 1;
        System.out.println(x);
    }

    public static void main(String[] args) throws InterruptedException {
        new _4Starter().makeItSo();

    }

    @Override
    public void run() {
        x = x * 2;
    }
}
