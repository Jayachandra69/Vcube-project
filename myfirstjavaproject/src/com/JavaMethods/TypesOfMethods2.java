package com.JavaMethods;

///2)no return type + with parameters
//string + anything is ------> string !!

public class TypesOfMethods2 {
	    static void addition(int a,int b) {
		System.out.println("sum of two numbers is :" + (a+b));
	}	
		static void subtraction(int a,int b) {
			System.out.println("subtraction of two numbers is :" + (a-b));
		}
		static void multiply(int a,int b) {
			System.out.println("product of two numbers is :" + (a*b));
			}
		 static void division(int a,int b) {
			System.out.println("division of two numbers is :" + (a/b));
			}
		static void modulus(int a,int b) {
			System.out.println("modulus of two numbers is :" + (a%b));
			}

	public static void main(String[] args) {
		System.out.println("Main method started!!");

		//call by value :
		addition(20,10);
		subtraction(20,10);
		multiply(20,10);
		division(20,10);
		modulus(20,10);
		
		System.out.println("Main method ended!!");
		
	}

}

