package com.DSA;

public class TestDsa_12 {

	public static void main(String[] args) {

		int arr[] = {1,-2,3,4,-5,9,-4};
		int currentSum = 0;
		int max = Integer.MIN_VALUE;//-2147483648
		
		for(int i =0;i<arr.length;i++) {
			currentSum = currentSum + arr[i];
			if(currentSum > max) {
				max = currentSum;
			}
			
			if(currentSum < 0) {
			   currentSum = 0;
			}
		}
		System.out.println("Maximum sub-array is : " + max);
	}

}
