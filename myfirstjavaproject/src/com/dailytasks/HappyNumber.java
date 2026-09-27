package com.dailytasks;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		boolean status = isHappy(n);
		
		if(status) {
			System.out.println("The given number " + n + " is a Happy number !!");
		}else {
			System.out.println("The given number " + n + " is not a Happy number !!");

		}
		sc.close();
	}

	static boolean isHappy(int n) {
        while (n != 1 && n != 4) {

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum = sum + digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
		
	}

}
