package com.dailytasks;

import java.util.Scanner;

public class smallPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int start =sc.nextInt();
        
        System.out.println("Enter the second number :");
        int end =sc.nextInt();
        
        for(int i = start;i<=end;i++) {
        	boolean isPrime = true;
        	
        	if(i<2) {
        		isPrime = false;
        	}
        	for(int j=2;j<i;j++) {
        		if(i % j == 0) {
        			isPrime = false;
        			break;
        		}
        		
        	}
        	if(isPrime) {
        		System.out.println("The smallest prime number is :"+ i);
        		break;
        	}
        }
        sc.close();
	}
}
