package com.dailytasks;

public class arraySum {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		int sum =0;
		byte nums[];
		
		nums = new byte[5];
		
		nums[0] = 10;
		nums[1] = 11;
		nums[2] = 12;
		nums[3] = 13;
		nums[4] = 14;
		
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
		}
		System.out.println("The sum all numbers is : " + sum);
		System.out.println("Main Method Ended !!");
	}
}
