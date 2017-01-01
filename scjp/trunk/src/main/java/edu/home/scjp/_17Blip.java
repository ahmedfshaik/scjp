package edu.home.scjp;

/**
 * Created by xprk578 on 12/7/2016.
 */
public class _17Blip {
    protected int blipvert(int x) {
        return 0;
    }
}

class Vert extends _17Blip {

    @Override
    public int blipvert(int x) {
        return 0;
    } // valid
//protected long blipvert(int x, int y) { return 0; }// Invalid
//protected long blipvert(long x) { return 0; }// Invalid
//protected int blipvert(long x) { return 0; }// Invalid
//protected long blipvert(int x) { return 0; }// Invalid
//private int blipvert(long x) { return 0; } // Invalid
//private int blipvert(int x) { return 0; } // Invalid
//public int blipvert(int x) { return 0; } // valid


}