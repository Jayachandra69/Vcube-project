package com.Arrays;

public class arr2 {

	public static void main(String[] args) {
		
		int [] marks = {99,98,97,96,95,94};
		
		double sum =0;
		double avg =0;
		
		for(int i =0 ;i<marks.length;i++) {
			sum+=marks[i];
		}
		avg = sum / marks.length;
		
		System.out.println("The Sum is :"+ sum );
		System.out.println("The Average is :"+ avg);

	}

}
