package edu.home.scjp;

public class _ExtendedA extends ClassA {
	private _ExtendedA(int numberOfInstances) {
		super(numberOfInstances);
	}

	public static void main(String[] args) {
		_ExtendedA ext = new _ExtendedA(420);
		System.out.print(ext.numberOfInstances);

	}

}

class ClassA {
	public int numberOfInstances;

	protected ClassA(int numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}
}
