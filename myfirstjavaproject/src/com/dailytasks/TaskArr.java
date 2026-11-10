package com.dailytasks;

import java.util.Arrays;

// Kth Largest Element After Sorting !!
public class TaskArr {

	public static void main(String[] args) {
		
		int[] a = {4,5,7,1,3};
		int k=3;
		
		for(int i=0;i<a.length;i++ ) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] =a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("after Sorting : " + Arrays.toString(a));
		System.out.println(k + "rd Largest Element : " + a[k-1]);
	}
}
