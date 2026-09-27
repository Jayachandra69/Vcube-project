package com.JavaMethods;

///1) no return type + no parameters : instance and static methods.
public class TypesOfMethods1 {

	public static void main(String[] args) {
		
		System.out.println("Main method started!!");
		TypesOfMethods1 t1 = new TypesOfMethods1();
		
		welcome();
		t1.display();
		TypesOfMethods1.welcome();
		
		System.out.println("Main method ended!!");
}
	void display(){
	    System.out.println("Display your Id card!");
	}
	
	static void welcome() {
		System.out.println("welcome to v-cube java!!");
	}

}
