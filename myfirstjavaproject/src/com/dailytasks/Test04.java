package com.dailytasks;

public class Test04 {

	static int add(int a) {
		return a+5;
	}
	
	static int multiply(int a) {
		return a*2;
	}
	
	public static void main(String[] args) {
		int result =multiply(add(5)) + add(10);//multiply(10) + 15 --> 20 + 15 = 35.
		System.out.println(result);
	}
}
