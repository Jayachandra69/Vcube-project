package com.DSA;

public class TwoSum {
	

	private static int[] twoSum(int[] nums, int target) {
		
		for(int i=0;i<nums.length;i++){
			for(int j =i+ 1;j<nums.length;j++) {
				if(nums[i] + nums[j] == target ) {
					return new int[] {i,j};
				}
			}	
		}
		return new int[] {};
	}

	public static void main(String[] args) {

		int nums [] = {1,5,3,8,2};
		int arr[] = twoSum(nums,10);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
}
// returns the index values where the sum of two targets met !! 