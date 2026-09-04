package com.langfundamentals;

public class student {
	Integer studentId; 
	String studentName;
	Character gender;
	String branchName;
	String collegeName ;
	
	void method() {
		System.out.println("******************************");
		System.out.println("Student Id:" + studentId);
		System.out.println("Student Name:" + studentName);
		System.out.println("Gender:" + gender);
		System.out.println("Branch Name:" + branchName);
		System.out.println("College Name:" + collegeName);
	}

	public static void main(String[] args) {
		
		student s =new student();
		s.studentId = 101;
		s.studentName = "Jayachandra";
		s.gender = 'M';
		s.branchName = "SET";
		s.collegeName = "DSU";
		s.method();
		
		s.studentId = 102;
		s.studentName = "Jyothish";
		s.gender = 'M';
		s.branchName = "SET";
		s.collegeName = "DSU";
		s.method();

	}

}
