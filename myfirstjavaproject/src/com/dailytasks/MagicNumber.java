package com.dailytasks;

import java.util.Scanner;

public class MagicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		boolean status =isMagic(n);
		
		if(status) {
			System.out.println(n + " is a Magic Number !!");
		}else {
			System.out.println(n + " is not a Magic Number !!");
		}
		sc.close();
	}

	static boolean isMagic(int n) {
		boolean status =false;
		int r = 0;
		int sum = 0;
		while( n > 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		while(sum > 9) {
			n = sum;
			sum = 0;
			while(n > 0) {
				r = n % 10;
				n = n / 10;
				sum = sum + r;
			}
		}
		if(sum == 1) {
			return true;
		}
		return status;
	}
}
