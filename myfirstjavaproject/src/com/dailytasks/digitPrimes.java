package com.dailytasks;

import java.util.Scanner;

public class digitPrimes {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		int r=0;
		int n1=n;
		int n2=n;
		int n3=n;
		while(n>0) {
			r = n % 10;
			n = n / 10;
			if(isPrime(r)) {
				System.out.println("The single digit prime numbers are : " + r);
			}
		}
		while(n1>0) {
			r = n1 % 100;
			n1 = n1 / 10;
			if(r >= 10 && r <= 99 && isPrime(r)) {
			    System.out.println("The double digit prime numbers are : " + r);
			}	
    	}
		while(n2>0) {
			r = n2 % 1000;
			n2 = n2 / 10;
			if(r >= 100 && r <= 999 && isPrime(r)) {
			    System.out.println("The triple digit prime numbers are : " + r);
			}
		}
		while(n3>0) {
			r = n3 % 10000;
			n3 = n3 / 10;
			if(r >= 1000 && isPrime(r)) {
			    System.out.println("The Higher digit prime numbers are : " + r);
			}
		}
		sc.close();
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