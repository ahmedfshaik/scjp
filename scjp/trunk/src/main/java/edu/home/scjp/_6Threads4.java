package edu.home.scjp;

public class _6Threads4 {

    public static void main(String[] args) {
        new _6Threads4().go();

    }

    public void go() {
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.print("foo");
            }
        };
        Thread t = new Thread(r);
        t.start();
        t.start();
    }

}
