package com.forLoops;

import java.util.Scanner;

public class NthPerfectNumber {

		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter a number :");
			int n = sc.nextInt();
			int count =0;

		for(int i=1;;i++) {
			
			if(isPerfect(i)) {
				count++;
			}
		if(count == n) {
			System.out.println("The " + n + " th perfect number is: " + i );
			break;
		    }
		
		 }
		sc.close();
	}
		
		   static boolean isPerfect(int n) {
			boolean status =false;
			int sum =0;
	        for(int i=1;i<=n/2;i++) {
				if (n%i == 0) {
					sum =sum +i;
				}
			}
				if(sum == n){
					status = true;
					}
				return status;
	   }

	}