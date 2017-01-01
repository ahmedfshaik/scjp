package edu.home.scjp;

public class _Test {

	public static void main(String[] args) {
		_Test.test(null);

	}

	public static void test(String str) {
		if (str == null | str.length() == 0) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
	}

}
