package com.dailytasks;

import java.util.Arrays;

public class SelcArr {

	public static void main(String[] args) {
		System.out.println("Main method Started ");
		
		int [] arr = {6,4,9,3,2,5,0};
		
		System.out.println("Before Sorting :");
		System.out.println(Arrays.toString(arr));
		
		int temp =0;
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex=j;
				}
			}
			temp =arr[i];
			arr[i]= arr[minIndex];
			arr[minIndex]= temp;
		}
		System.out.println("After Sorting :");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Main Method Ended !!");	
	}
}
