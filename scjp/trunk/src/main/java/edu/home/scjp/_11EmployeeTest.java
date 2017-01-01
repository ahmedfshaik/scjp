package edu.home.scjp;

public class _11EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee employee = new Employee("4321");
		System.out.println(employee.empId);
	}

}

class Person {
	String name = "No Name";

	public Person(String nm) {
		name = nm;
	}
}

class Employee extends Person {

	String empId = "0000";

	public Employee(String id) {
		super("");//Should write super keyword
		empId = id;
		// TODO Auto-generated constructor stub
	}

}
