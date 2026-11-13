package com.Snippets;

class Student {
	Student(){
		this(100);
		System.out.println("Default Constructor Called !!");
	}

	Student(int id) {
		this(id,"java");
		System.out.println("Parameterized Constructor Called !!");
	}

	Student(int id, String name) {
		System.out.println( id + " " + name);
}

	public static void main(String[] args) {
		Student s = new Student();
	}

}
