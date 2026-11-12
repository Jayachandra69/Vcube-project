package com.dailytasks;

public class Demo {
	
	static int x=10;
	int y=20;
	
	static void show() {
		x+=5;
		System.out.println("X Value is :" + x);
	}
	
	void display() {
		y+=x;
		System.out.println("Y Value is :" + y);
	}

	public static void main(String[] args) {
		Demo d1 =new Demo();
		Demo d2 =new Demo();
		
		d1.show();//The static method show() from the type Demo should be accessed in a static way !!
		d1.display();
		d2.display();
		d2.show();//The static method show() from the type Demo should be accessed in a static way
	}

}
