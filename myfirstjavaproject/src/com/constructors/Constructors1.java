package com.constructors;

public class Constructors1 {
//	This is the No-arg constructor same as the class name !! 
	int id;
	String name;
	
	Constructors1(){ 
		id = 100;
		name = "unknown";
		System.out.println("No-arg constructor called !!");
	}

	public static void main(String[] args) {
		
        System.out.println("Main method Started !!");
		Constructors1 c = new Constructors1(); //The object is created using the default constructor !!
		c.show();
		Constructors1 c1 = new Constructors1();
		c1.show();
	}
	void show() {
		System.out.println("Customer id is : " + id);
        System.out.println("Customer name is : " + name);

	}

}
