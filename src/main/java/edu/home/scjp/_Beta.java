package edu.home.scjp;

public class _Beta extends Alpha {
	public void foo(String a) {
		System.out.println("_Beta:foo()");
	}

	public void bar(String a) {
		System.out.println("_Beta:bar()");
	}

	public static void main(String[] args) {
		Alpha a = new _Beta();
		a.foo("");
		a.bar("");

		_Beta b = (_Beta) a;
		b.foo("");
		b.bar("");
 
	}

}

class Alpha {
	public void foo(String... a) {
		System.out.println("Alpha:foo()");
	}

	public void bar(String a) {
		System.out.println("Alpha:bar()");
	}
}
