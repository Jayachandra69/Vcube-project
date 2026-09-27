package com.JavaMethods;

import java.util.Scanner;
///  3) with return type + no parameters
///---> Reading values from console using  Scanner !!
public class TypesOfMethods5 {
      String name;
	    int age;
	    int marks;

	    Scanner sc = new Scanner(System.in);

	    String getName() {
	        System.out.print("Enter student name: ");
	        name = sc.nextLine();
	        return name;
	    }

	    int getAge() {
	        System.out.print("Enter student age: ");
	        age = sc.nextInt();
	        return age;
	    }

	    int getMarks() {
	        System.out.print("Enter student marks: ");
	        marks = sc.nextInt();
	        return marks;
	    }

	    public static void main(String[] args) {

	    	TypesOfMethods5 s = new TypesOfMethods5();

	        String studentName = s.getName();
	        int studentAge = s.getAge();
	        int studentMarks = s.getMarks();

	        System.out.println("\n--- Student Details ---");
	        System.out.println("Name  : " + studentName);
	        System.out.println("Age   : " + studentAge);
	        System.out.println("Marks : " + studentMarks);
	    }
	
	}


