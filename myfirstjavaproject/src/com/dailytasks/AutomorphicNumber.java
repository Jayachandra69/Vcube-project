package com.dailytasks;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n =sc.nextInt();
		
		int square = n * n;
		int temp = n;
		int count = 0;
		int mod =1;
		while(temp > 0) {
			count ++;
			temp = temp / 10;
		}
		
		for(int i =1; i<= count; i++) {
			mod =mod*10;
		}
		
		System.out.println("Square of the given number is : " + square);
		
		if(square % mod == n) {
			System.out.println( n + " is an Automorphic Number !!");
		}else {
			System.out.println( n + " is not an Automorphic Number !!");
		}
		sc.close();
	}

}
