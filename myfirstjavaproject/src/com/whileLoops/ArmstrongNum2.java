package com.whileLoops;

import java.util.Scanner;

public class ArmstrongNum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =sc.nextInt();
		
		boolean status =isArmStrong(n);
		
		if(status) {
			System.out.println(n + " is an Armstrong Number !!");
		}else {
			System.out.println(n + " is not an Armstrong Number !!");
		}
        sc.close();
	}

	static boolean isArmStrong(int n) {
		boolean status = false;
		int r= 0;
		int sumP = 0;
		int temp = n;
		String str =Integer.toString(n);
		int digitcount = str.length();
		
		while(n > 0) {
			r = n % 10;
			n = n / 10;
			sumP = (int) (sumP + Math.pow(r, digitcount));
		}
		
		if(temp == sumP) {
			return true;
		}
		
		return status;
	}

}
