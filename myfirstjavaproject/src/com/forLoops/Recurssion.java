package com.forLoops;

import java.util.Scanner;

public class Recurssion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int n =sc.nextInt();
		int fact=findFact(n);
		
		System.out.println("Factorial of given number is :" + fact);
        sc.close();
	}
	
	static int findFact(int n) {
		if(n == 0 || n == 1){
			return 1;
			}
		return n * findFact(n-1);
	}

}
