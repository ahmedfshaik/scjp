package edu.home.scjp;
//Return type should be same or child class
interface A1 {

    void doSomething(String thing);
}

class AImpl
        implements A1 {

    @Override
    public void doSomething(String thing) {
        System.out.println("AImpl:doSomething()");

    }

}

class B1 {

    public int doIt(int x) {
        return 0;
    }

    public int doIt(long x) {
        // TODO Auto-generated method stub
        return 0;
    }

    public String execute() {
        return "";
    }
}

public class _10C
        extends B1 {

    @Override
    public int doIt(long x) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String execute() {
        // TODO Auto-generated method stub
        return super.execute();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
