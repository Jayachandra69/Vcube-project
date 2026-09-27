package com.dailytasks;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		
		boolean status = isNeon(n);
		
		if(status) {
			System.out.println("The given number " + n + " is neon number !!");
		}else {
			System.out.println("The given number " + n + " is not a neon number !!");
		}
        sc.close();
	}

	static boolean isNeon(int n) {
		int square = n*n;
		int sum = 0;
		
		while(square > 0) {
			int digit = square % 10;
			sum = sum + digit;
			square = square /10;	
		}
		
		return sum == n;
	}

}
