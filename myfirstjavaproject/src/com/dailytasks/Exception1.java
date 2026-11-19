package com.dailytasks;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		System.out.println("Main Method Started !!");
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number :");
			int a = sc.nextInt();
			
			System.out.println("Enter the Number :");
			int b= sc.nextInt();
			
			System.out.println(a/b);
			
		}catch(ArithmeticException e){
			System.out.println("Don't enter zero's !!");
			e.printStackTrace();
		}
		System.out.println("Have a Good Day !!");
		System.out.println("Main Method Ended !!");
	}
}
// This IS called as Grace Termination --> where catch block catches the Exception 
//and prints the next Statements !!