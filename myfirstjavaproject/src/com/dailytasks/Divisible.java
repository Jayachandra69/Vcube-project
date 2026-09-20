package com.dailytasks;

import java.util.Scanner;

public class Divisible {

	 void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		divisor(n);
        sc.close();
	}
	
	void divisor(int n) {
		for(int i=1;i<=n;i++) {
		}
			if(n%3== 0 && n%5==0 ) {
				System.out.println(n + " is divisible by both 3 and 5 !!");
			}else {
				System.out.println(n + " is not divisible by both 3 and 5 !!");
		}
	}
}
