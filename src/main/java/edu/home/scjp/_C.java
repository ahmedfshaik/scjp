package edu.home.scjp;

public class _C extends _B1 {
	public void add(_C c) { c.getValue(); }
	public void add(_B1 b) { b.getValue(); }
	public void add(_A1 a) { a.getValue();}
	public void add(_A1 a, B b) { a.getValue(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface _A1 {
	public int getValue();
}

class _B1 implements _A1 {
	public int getValue() {
		return 1;
	}
}