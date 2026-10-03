package com.dailytasks;

import java.util.Scanner;

public class disariumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int count = 0;
		int n1=n;
		int temp =n;
		while(n1>0) {
			n1 =n1/10;
			count ++;
		}
		
		int r= 0;
		int sum = 0;
		while(n>0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, count));
			count--;
		}
		System.out.println(sum);
		
		if(sum == temp) {
			System.out.println("The given number is disarium number !!"); 
		}else{
			System.out.println("The given number is not a disarium number !!"); 
		}
		sc.close();
	}

}
