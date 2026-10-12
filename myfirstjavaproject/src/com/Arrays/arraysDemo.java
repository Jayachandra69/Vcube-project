package com.Arrays;

public class arraysDemo {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started !!");
		
//		Step1 : creation
		int ages[];
		
//		Step2 : Declaration
		ages = new int[5];
		
//		Step3 : Initialization
		ages[0] =21;
		ages[1] =22;
		ages[2] =23;
		ages[3] =24;
		ages[4] =25;
		
//		Step4 : Representation
//		using for each loop to Represent the data !!
		for(int age :ages) {
			System.out.println(age);
		}
		System.out.println("**************************");
		
//		using for loop to Represent the data !!
		for(int i =0;i<ages.length;i++) {
			System.out.println(ages[i]);
		}
		
//		printing only even ages !!
		System.out.println("--------------------------------");
		for(int i =0;i<ages.length;i++) {
			if(ages[i] % 2 == 0) {
				System.out.println(ages[i]);
			}
		}
		
		System.out.println("Main Method Ended !!");
	}
}
