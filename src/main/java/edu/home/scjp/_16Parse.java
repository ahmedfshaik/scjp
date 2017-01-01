package edu.home.scjp;

/**
 * Created by xprk578 on 12/7/2016.
 */
public class _16Parse {

    public static void parse(String str){
        try {
            float f = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            //f=0; change scope
        } finally {
           // System.out.println(f);
        }
    }

    public static void main(String[] args) {
        _16Parse.parse("invalid");
    }
}
