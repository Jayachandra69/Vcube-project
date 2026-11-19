package com.dailytasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number :");
			int a = sc.nextInt();
			
			System.out.println("Enter the Number :");
			int b= sc.nextInt();
			
			System.out.println(a/b);
			sc.close();
		}catch(InputMismatchException e){
			System.out.println("Something Went Wrong !!");
			e.printStackTrace();
		}
		System.out.println("Have a Good Day !!");
		System.out.println("Main Method Ended !!");
	}
}
// Grace Termination by InputMismatchException !!
// Shows name of exception : java.util.InputMismatchException
// Location : at com.dailytasks.Exception2.main(Exception2.java:13)