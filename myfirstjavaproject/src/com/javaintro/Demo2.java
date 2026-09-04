package com.javaintro;

public class Demo2 {
		 
	static void Method1() {
		Demo3 s =new Demo3();
		s.method2();
		
		System.out.println("method1 called !");
	}
	 void method2 () {
		method3();
		System.out.println("method2 called!");
		
	}
	 static void method3() {
		 Demo3 s =new Demo3();
		 s.method4();
		 System.out.println("method3 called!");
	}
	 
	 void method4() {
		 method5();
		System.out.println("method4 called!");
	}
	 
	static void method5() {
			System.out.println("method5 called!");
		}

	public static void main(String[] args) {
		System.out.println("Main method started!");
		
		Method1();
		
		System.out.println("Main method ended !");

	}

}
