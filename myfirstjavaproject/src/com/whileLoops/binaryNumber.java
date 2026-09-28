package com.whileLoops;

import java.util.Scanner;

public class binaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =sc.nextInt();
		convertToBinary(n);
        sc.close();
	}

	static void convertToBinary(int n) {
		int r=0;
		String str = "";
		
		while(n>0) {
			r = n % 2;
			n = n / 2;
			str = r + str;
		}
		System.out.println("The binary conversion to the number is :"+ str);
		
	}

}
