package edu.home.scjp;

public class _5Tester
        implements Runnable {

    static PingPong2 pp2 = new PingPong2();

    public static void main(String[] args) {
        new Thread(new _5Tester()).start();
        new Thread(new _5Tester()).start();

    }

    @Override
    public void run() {
        pp2.hit(Thread.currentThread().getId());

    }

}

class PingPong2 {

    synchronized void hit(long n) {
        for (int i = 1; i < 3; i++)
            System.out.print(n + "-" + i + " ");
    }
}
