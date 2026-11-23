package com.dailytasks;

import java.util.Arrays;

public class NewArr {

	public static void main(String[] args) {
		
		int arr[] = {99,95,71,44,17,78,66};
		int r =0;
		
		for(int i=0;i<arr.length;i++) {
			
			r = arr[i] % 10;
			
			if(r == 0 || r == 1 || r == 2 || r == 3 || r == 4 || r == 5) {
				arr[i] = arr[i] - r;
			}
			if(r == 6 || r == 7 || r == 8 || r == 9) {
				r = 10 - r;
				arr[i] = arr[i] + r;
			}	
		}
		System.out.println(Arrays.toString(arr));
	}
}
// Rounding the nearest number values !! [ 0 --> 5 - 0 ] - [ 6 --> 9 - 10] 