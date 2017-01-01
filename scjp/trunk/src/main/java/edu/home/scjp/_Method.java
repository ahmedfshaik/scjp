package edu.home.scjp;

public class _Method extends D implements C {
	public void aMethod() {
		System.out.println("_Method:aMethod()");
	}

	public void bMethod() {
		System.out.println("_Method:bMethod()");
	}

	public void cMethod() {
		System.out.println("_Method:cMethod()");
	}

	public static void main(String[] args) {
		D d = new _Method();
		d.bMethod();

	}

}

interface A {
	public void aMethod();
}

interface B {
	public void bMethod();
}

interface C extends A, B {
	public void cMethod();
}

class D implements B {
	public void bMethod() {
		System.out.println("D:bMethod()");
	}
}
