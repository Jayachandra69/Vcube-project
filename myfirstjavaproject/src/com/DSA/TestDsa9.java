package com.DSA;

//            PREFIX SUM  !!
public class TestDsa9 {

	public static void main(String[] args) {
		
		int arr[] = {5,10,20,50,100};
		int prefix[] = new int[arr.length];
		
		prefix[0] = arr[0];
		
		for(int i =1;i<arr.length;i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		for(int e:prefix) {
			System.out.print(e + " ");
		}
	}
}
// Time Complexity : O(n)
