package com.dailytasks;

public class Test {

	void display(int a) {
		System.out.println("Integer Method Called !!");
	}
	

	void display(double a) {
		System.out.println("Double Method Called !!");
	}
	

	void display(long a) {
		System.out.println("Long Method Called !!");
	}
	public static void main(String[] args) {
		Test t= new Test();
		t.display(10);//int
		t.display(10.5f);//double
		t.display('A');//int
	}
}
