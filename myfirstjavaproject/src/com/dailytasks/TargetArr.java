package com.dailytasks;

public class TargetArr {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int target = 6;
        System.out.println("Pairs whose sum is " + target + ":");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
				    System.out.println("(" + arr[i] + "," + arr[j] + ")");
				}
			}	
		}
	}
}
