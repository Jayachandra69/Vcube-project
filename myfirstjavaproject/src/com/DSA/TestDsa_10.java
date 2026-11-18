package com.DSA;

//             RANGE SUM  !!
public class TestDsa_10 {

	public static void main(String[] args) {
		
		int arr[] = {5,10,20,50,100};
		int prefix[] = new int[arr.length];
		
		prefix[0] = arr[0];
		
		System.out.println("Prefix sum of Elements :");
		for(int i =1;i<arr.length;i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		for(int e:prefix) {
			System.out.print(e + " ");
		}
	
		int l = 2;
		int r = 4;
		int sum = 0;
		
		if(l == 0) {
			sum = prefix[r];
		}else {
			sum = prefix[r] - prefix[l-1];
		}
		System.out.println();
		System.out.println("Sum of range " + l + "," + r + " are : " + sum);

	}

}
