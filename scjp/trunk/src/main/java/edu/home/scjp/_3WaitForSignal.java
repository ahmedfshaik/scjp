package edu.home.scjp;

public class _3WaitForSignal {

    public static void main(String[] args) {
        _3WaitForSignal signal = new _3WaitForSignal();
        signal.waitForSignal();
    }

    void waitForSignal() {
        Object obj = new Object();
        synchronized (Thread.currentThread()) {
            try {
                obj.wait();
                obj.notify();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
