package com.dailytasks;

import java.util.Scanner;

public class HighestPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int start =sc.nextInt();
		
		System.out.println("Enter the last number :");
		int end =sc.nextInt();
		
		for(int i=end;i>=start;i--) {
			boolean isPrime =true;
			
			if(i<2) {
				isPrime=false;
			}
			
			
			for(int j=2;j<i;j++) {
				if(i % j == 0) {
					isPrime =false;
					break;
				}
				
			}
			if(isPrime) {
				System.out.println("The highest prime number is :" + i);
				break;
			}
			
		}
		sc.close();

	}

}
