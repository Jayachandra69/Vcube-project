package com.dailytasks;

public class Test03 {

	static void display(int ...a) {
		int sum = 0;
		
		for(int x: a) {
			sum +=x;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		display(10,20);
		display(1,2,3,4);
		display();
	}
}
