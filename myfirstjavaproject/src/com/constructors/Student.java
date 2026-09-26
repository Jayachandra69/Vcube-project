package com.constructors;

//Parameterized constructor !!

public class Student {
	int student_id;
	String name;
	int age;
	
	Student(){
		System.out.println("No-Arg constructor called !!");
		student_id = 100;
		name = "unknown";
		age = 20;
	}
	
//	we can use different names for local variables and store the values but
//	Here we use "this" keyword for better readability and code re-usability !!
	Student(int student_id,String name, int age){
		System.out.println("Parameterized constructor called !!");
		this.student_id = student_id;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!");
		
		Student s0 = new Student();
		s0.student_id = 100;
		s0.name = "AA";
		s0.age = 20;
		s0.StudentInfo();
		
		Student s1 = new Student(101,"JC",22);
		s1.StudentInfo();
		
		Student s2 = new Student(102,"JP",21);
		s2.StudentInfo();
		
        System.out.println("Main method ended !!");
	}
	void StudentInfo() {
		System.out.println("The student id is : " + student_id);
		System.out.println("The student name is : " + name);
		System.out.println("The student age is : " + age);
		System.out.println("*************************************");
	}

}
