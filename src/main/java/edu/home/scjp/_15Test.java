package edu.home.scjp;

/**
 * Created by xprk578 on 12/7/2016.
 */
public class _15Test {
    public static void main(String[] args) {
        System.out.println(new TestA() {
            @Override
            public String toString() {
                return "test";
            }
        });
    }
}

interface TestA{
    String toString();
}
