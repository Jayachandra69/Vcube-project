package com.whileLoops;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number until you want to print prime numbers :");
		int n=sc.nextInt();
		int i=2;
		System.out.println("The prime numbers until " + n +" are : " );
		sc.close();
		
		while(i<=n) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
			i++;
		}

	}
	
	static boolean isPrime(int n) {
		boolean status = true;
		int i=2;
		if(n == 0 || n== 1) {
			return false;
		}
		while(i<n/2) {
			if(n % i == 0) {
				status =false;
				break;
			}
			i++;
		}
		return status;
	}

}
