package com.forLoops;

import java.util.Scanner;

public class Nprimes {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number util the count of prime numbers required : ");
		int n=sc.nextInt();
		int count =0;
		sc.close();
		System.out.println("The prime numbers are :");
		
		for(int i=1;i<=n;i ++) {
			if(isPrime(i)) {
				count ++;
				System.out.print(i + " ");
			}	
		}
		System.out.println();
		System.out.println("The count of prime numbers from 0 to " + n + " is : " + count);
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
