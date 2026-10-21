package com.Arrays;

public class arr5 {

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		
		int arr[][] = new int[3][2];//0,1,2 ----> 0,1
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		
//		For Loop !!
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		
//		For Each Loop !!
		for(int [] a1:arr) {
			for(int a:a1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
		System.out.println("Main Method Ended !!");

	}

}
