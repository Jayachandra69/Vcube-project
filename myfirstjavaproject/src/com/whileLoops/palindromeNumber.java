package com.whileLoops;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		boolean status =palindromeNum(n);
		if(status) {
			System.out.println("The given number is a Palindrome number !!");
		}else {
			System.out.println("The given number is not a Palindrome number !!");
		}
		sc.close();
	}

	static boolean palindromeNum(int n) {
		boolean status =false;
		int r=0;
		int sum =0;
		int temp = n;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum =sum * 10 + r;
		}
		if(temp == sum) {
			return true;
		}
		return status;
	}

}
