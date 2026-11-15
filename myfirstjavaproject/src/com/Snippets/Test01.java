package com.Snippets;

class A {
	A(){
		System.out.println("A Class Called !!");
	}
}
class B extends A{
	B(){
		System.out.println("B Class Called !!");
	}
}

class C extends B{
	C(){
		System.out.println("C Class Called !!");
	}
}

public class Test01 {

	public static void main(String[] args) {
		C obj = new C();
	}

}
