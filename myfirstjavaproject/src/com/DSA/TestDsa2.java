package com.DSA;

import java.util.Scanner;

//       LINEAR SEARCH

//If the Value is found in the First place :
//Enter a key Value :
//2
//Key Index is :0
//BestCase--> O(1)

//If the Value is found in the Middle place :
//Enter a key Value :
//54
//Key Index is :4
//AverageCase--> O(n)

//If the Value is found in the last or end or NOT FOUND :
//Enter a key Value :
//70
//Key Index is :8
// Ex for not found --> Enter a key Value :
//10
//Key Index is :-1
//WorstCase--> O(n)

public class TestDsa2 {
	
	static int search(int []arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;	
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
		int arr[] = {2,37,99,48,54,64,83,15,70};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a key Value :");
		int key = sc.nextInt();
		
		System.out.println("Key Index is :"+ search(arr,key));
		System.out.println("Main Method Ended !!");
		sc.close();
	}
}
