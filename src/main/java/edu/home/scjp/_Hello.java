package edu.home.scjp;

public class _Hello {
	String title;
	int value;

	public _Hello() {
		title += " World";
	}

	public _Hello(int value) {
		this.value = value;
		title = "Hello";
		//_Hello(); //new operator required
	}
}
