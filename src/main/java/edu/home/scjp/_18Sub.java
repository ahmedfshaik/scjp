package edu.home.scjp;

/**
 * Created by xprk578 on 12/7/2016.
 */

class Super {
    private int a;

    protected Super(int a) {
        this.a = a;
    }
}

public class _18Sub extends Super {
    public _18Sub(int a) {
        super(a);
    }

    public _18Sub() {
        //this(5); or super(5); both are valid
        this(5);
        //this.a = 5;
    }
}