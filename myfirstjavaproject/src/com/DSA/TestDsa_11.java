package com.DSA;

//             SLIDING WINDOW TECHNIQUE  !!
public class TestDsa_11 {

	public static void main(String[] args) {
		
		int [] visitors = {10,38,120,25,51,44,170};
		int days = 3;
		
		int windowSum =0;
		
		for(int i =0;i<days;i++) {
			windowSum =  + windowSum + visitors[i];
		}
		int avg = windowSum / days;
		System.out.println("Total No.Of Visitirs Visited in the First Window : " + windowSum);
		System.out.println("average on First Window : " + avg);
		
		for(int i=1;i<= visitors.length-days;i++) {
			windowSum = windowSum - visitors[i -1] + visitors[i + days-1];
		    avg = windowSum / days;
			System.out.println("Total NO.Of Visitors Visited in next Window : " + windowSum + " , Average : " + avg);
		}
	}
}
