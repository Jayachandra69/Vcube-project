package com.forLoops;

public class EvenandOddNumbers {

	public static void main(String[] args) {
		
		System.out.println("Even Numbers are :");
        for(int i=0;i<=100;i++) {
        	if(i%2 == 0 && i !=0) {
        		System.out.print(i + " ");
        	}
        }
        System.out.println();
        System.out.println("ODD Numbers are :");
        for(int i=0;i<=100;i++) {
        	if(i%2 == 1 && i !=0) {
        		System.out.print(i + " ");
        	}
    	}
	}
}
