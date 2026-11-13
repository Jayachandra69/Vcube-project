package com.dailytasks;

class parent{
	static void show() {
		System.out.println("Parent Method Called !!");
	}
}

class child extends parent{
	static void show(){
		System.out.println("Child Method Called !!");
	}
}

public class Test05 {

	public static void main(String[] args) {
		 parent p = new child();
		 child c= new child();
		 
		 p.show();
		 c.show();
	}
}
