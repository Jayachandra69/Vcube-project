package com.dailytasks;

public class Test02 {

	static void change(int a, int b) {
		a=a+10;
		b=b+20;
	}
	public static void main(String[] args) {
		int x=10 , y=20;
		
		change(x,y);
		
		System.out.println(x + " " + y);
	}
}
