package com.operators;

import java.util.Scanner;

//WAP to do calculator with methods..? 
///1) Arithmetic Operators 
/// + - *  /  % 
public class Operators1 {

	void main(String[] args) {
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);

		int a = 10;
		int b = 20;
		System.out.println("Addition is --> Sum : " + a + b);// 1020
		System.out.println("Addition is : " + (a + b));// 30

//		The operator - is undefined for the argument type(s) String, int
//		System.out.println("Subtraction is : " + b -a );
		System.out.println("Subtraction is ---> Diff : " + (b - a));

//		BODMAS 
		System.out.println("Multiplication --> Product " + a * b);

		int x = 98;
		int y = 4;

//		4)98(24 (Quotient /)        8)765(95 
//		  96                          72
//		----------2(Reminder % )     -----45-40 = 5 
//		2/10 --> 0 --> 2 

		System.out.println("Division is --> quotient : " + x / y);// 98/4 --> 24
		System.out.println("Modulus is --> Reminder : " + x % y);// 2

		System.out.println("Enter first number : ");
		float a1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		double a2 = sc.nextDouble();

		double sum = addition(a1, a2);
		System.out.println("Sum of two numbers are : " + sum);
		
		
		System.out.println("Enter first number : ");
		float b1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		double b2 = sc.nextDouble();

		double Difference = subtraction(b1, b2);
		System.out.println("Difference of two numbers are : " + Difference);
		
		System.out.println("Enter first number : ");
		float c1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		double c2 = sc.nextDouble();

		double product = Multiplication(c1, c2);
		System.out.println("product of two numbers are : " + product);
		
		System.out.println("Enter first number : ");
		float d1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		double d2 = sc.nextDouble();

		double divide = Division(d1, d2);
		System.out.println("Division of two numbers are : " + divide);
		
		System.out.println("Enter first number : ");
		float e1 = sc.nextFloat();

		System.out.println("Enter second number : ");
		double e2 = sc.nextDouble();

		double Modulus = modulus(e1, e2);
		System.out.println("Sum of two numbers are : " + Modulus);
		
		
		sc.close();

	}

	double addition(float a, double b) {
		double sum = a + b;
		return sum;
		
	}
	
	double subtraction(float a, double b) {
		double Difference = a - b;
		return Difference;
	}
	
	double Multiplication(float a, double b) {
		double product = a*b;
		return product;
	}
	
	double Division(float a, double b) {
		double divide = a / b;
		return divide;
	}
	
	double modulus(float a, double b) {
		double modulus = a % b;
		return modulus;
	}	

}