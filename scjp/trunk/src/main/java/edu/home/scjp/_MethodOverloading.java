package edu.home.scjp;

public class _MethodOverloading {
	
	public static void main(String[] args){
		
		_MethodOverloading overloading = new _MethodOverloading();
		
		byte a1 = 10;
		//overloading.m1(null);
		
		short a2 = 10;
		overloading.m1(a2);
		
		int a3 = 10;
		overloading.m1(a3);
		
		long a4 = 10;
		overloading.m1(a4);
		
		float a5 = 10.0f;
		overloading.m1(a5);
		
		double a6 = 10.0;
		overloading.m1(a6);
	}
	
	/*public void m1(int a){
		System.out.println("int");
	}*/
	
	public void m1(String a){
		System.out.println("String");
	}
	
	public void m1(Integer a){
		System.out.println("Integer");
	}
	
	public void m1(Object a){
		System.out.println("obj");
	}

}
