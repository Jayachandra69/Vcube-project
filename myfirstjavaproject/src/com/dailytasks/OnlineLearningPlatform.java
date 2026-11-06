package com.dailytasks;

class User{
	
	String userName;
	String password;
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	void DisplayDetails() {
		System.out.println("User Name :" + userName);
	}
}

class Student extends User{

	public Student(String userName, String password) {
		super(userName, password);
	}
	
	void submitAssignment() {
		System.out.println(userName + " -> Submitted an Assignment !!");
	}
	
}

class Instructor extends User{

	public Instructor(String userName, String password) {
		super(userName, password);
	}
	void createCourse() {
		System.out.println(userName + " -> Created A new Course !!");
	}
	
}

class Admin extends User{

	public Admin(String userName, String password) {
		super(userName, password);
	}
	void managePLatform() {
		System.out.println(userName + " -> is Managing the Platform !!");
	}
	
}

public class OnlineLearningPlatform {

	public static void main(String[] args) {
		
		Student s =new Student("Jayachandra", "Stu@123");
		System.out.println("-----------STUDENT-------------");
		s.DisplayDetails();
		s.submitAssignment();
		
		Instructor in = new Instructor("Shiva","Trainer@113");
		System.out.println("\n-----------INSTRUCTOR-------------");
		in.DisplayDetails();
		in.createCourse();
		
		Admin aa = new Admin("Admin00","Create@#1109");
		System.out.println("\n-----------ADMIN-------------");
		aa.DisplayDetails();
		aa.managePLatform();
	}
}
