package com.dailytasks;
//input: 145
//output =1! +4! + 5! =1 + 24 + 120 =145 -- Strong Number !!
import java.util.Scanner;

public class strongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =sc.nextInt();
		boolean status =isStrong(n);
		if(status) {
			System.out.println(n + " is a strong number !!");
		}else {
			System.out.println(n + " is not a strong number !!");
		}
        sc.close();
	}

	static boolean isStrong(int n) {
		boolean status = false;
		int sum =0;
		int original =n;
		while(n>0) {
			int digit =n % 10;
			n =n/10;
			int fact=1;
			for(int i=1;i<=digit;i++){
				fact =fact*i;
				}
			sum = sum + fact;
		}
		if(sum == original) {
			return true;
		}
		
		return status;
	}

}
