package com.DSA;
import java.util.Scanner;

//            BINARY SEARCH !!

public class TestDsa3 {
	
	private static int binarySearch(int[] arr, int key) {
		int low =0;//Lowest Possible Index 
		int high = arr.length-1;// Highest Possible Index 
		
		while(low <= high) {
			int mid = low + (high - low) / 2;
			
			if(arr[mid] == key) {
				return mid;// Best Case : Omega(1)
			} else if(key < arr[mid]) {
				high = mid-1;//Reducing The Upper Bound 
			} else {
				low = mid + 1;//Reducing The Lower Bound !!
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		System.out.println("Main Method Started !!");
		
		int arr[] = {1,2,3,4,5,6,7,8,9};// Must Be a Sorted Array !!
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key Value :");
		int key = sc.nextInt();
		
		System.out.println("Element Found At the Index : " + binarySearch(arr,key));
		
		System.out.println("Main Method Ended !!");
		sc.close();
	}
}
// Time Complexity is O(log n) --> Because it is an iterative Binary Search !!
// Space Complexity is O(1) --> Because it uses
// only a constant number of variables and No extra Memory !!
