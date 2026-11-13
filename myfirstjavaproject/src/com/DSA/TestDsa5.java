package com.DSA;
import java.util.Arrays;
//           SELECTION SORT  !!

public class TestDsa5 {

	public static void main(String[] args) {
		int []arr = {6,9,3,5,7,2,4};
		int temp = 0;
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		
		for(int i =0;i<arr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
				   minIndex = j;
				}
			}
			if(minIndex != i) {
			  temp =arr[i];
			  arr[i] = arr[minIndex];
			  arr[minIndex] = temp;
			}
		}
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
}
