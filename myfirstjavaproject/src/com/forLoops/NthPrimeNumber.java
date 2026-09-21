package com.forLoops;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the nth prime number value you want to print : ");
		int n=sc.nextInt();
		int count =0;
		sc.close();
		
		for(int i=2;;i ++) {
			if(isPrime(i)) {
				count ++;
				if(count == n) {
					System.out.println("The " + n + "th prime number is: " + i);
					break;
				}
			}
			
		}
	}
	
	
	static boolean isPrime(int n) {
		boolean status =true;
		if(n == 0 || n == 1) {
			return false;
}
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				status = false;
				break;
			}	
		}
		
		return status;
	}

}
