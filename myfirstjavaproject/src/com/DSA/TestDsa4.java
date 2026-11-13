package com.DSA;
import java.util.Arrays;
//             BUBBLE SORT !!
public class TestDsa4 {

	public static void main(String[] args) {
		
		int[] arr = {5,8,4,1,9,6};
		System.out.println("Size of the Array : " + arr.length);
		System.out.println("Before Sorting : " + Arrays.toString(arr));		
		int temp = 0;
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length;i++) {
			count++;
			boolean swapped = false;
			for(int j=0;j<arr.length-i-1;j++) {
				count1++;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] =temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("Count of 1st loop : " + count);
		System.out.println("Count of 2nd loop : " + count1);
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
}
