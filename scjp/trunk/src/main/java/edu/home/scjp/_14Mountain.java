package edu.home.scjp;

/**
 * Created by xprk578 on 12/7/2016.
 */
public class _14Mountain extends Rock {

    _14Mountain(){
        super("granite ");
        new Rock("granite ");
    }

    public static void main(String[] args) {
        _14Mountain mountain = new _14Mountain();
    }

}

class Atom {
    Atom(){
        System.out.print("atom ");
    }
}

class Rock extends Atom {
    Rock(String type){
        System.out.print(type);
    }
}