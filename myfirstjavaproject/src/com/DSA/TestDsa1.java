package com.DSA;

import java.util.Scanner;


// Time Complexity is -->O(1) => when we use constant value
// Time Complexity is -->O(n) => when we taken the value from console !!
// Space complexity is O(n)
public class TestDsa1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value :");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			System.out.println(i);
		}
		System.out.println("Main Method Ended !!");
		sc.close();
	}
}
