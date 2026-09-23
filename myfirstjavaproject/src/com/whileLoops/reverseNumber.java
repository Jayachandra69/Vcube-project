package com.whileLoops;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int rev =reverseNum(n);
		System.out.println("Reverse num of the given number is :" + rev);
		if(rev == n) {
			System.out.println("Given number is a Palindrome Number !!");
		}else {
			System.out.println("Given number is not a Palindrome Number !!");
		}
        sc.close();
	}

	static int reverseNum(int n) {
		int rev =0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev =rev *10 +r;
		}
		return rev;
	}

}
