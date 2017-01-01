package edu.home.scjp;

public class _Demo {

	public static void main(String[] args) {
		_A2 a = new _B2(); 
		_A2 b = new _C2();
		_C2 c = new _C2();
		
		a.a2();
		c.a2();
		c.c1();
		c.a1();
		a.a1();

	}

}

abstract class _A2 {
	abstract void a1();

	void a2() {
		System.out.println("_A2:a2");
	}
}

class _B2 extends _A2 {
	void a1() {
		System.out.println("_B2:a1");
	}

	void a2() {
		System.out.println("_B2:a2");
	}
}

class _C2 extends _B2 {
	void c1() {
		System.out.println("_C3:c1");
	}
}
