package com.dailytasks;

import java.util.Scanner;

public class evenDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
        int n=sc.nextInt();
        
        int temp =n;
        int count =0;
        while(temp>0) {
        	count++;
        	temp=temp/10;
        }
          int sum =0;
          int position = count;
          for(int i=1;i<=count;i++) {
        	int digit = n % 10;
        	if(digit % 2 == 0) {
        	}
        	if(position % 2 == 0) {
        		sum =sum + digit;
        	}
        	n=n/10;
        	position--;
        }
        
        System.out.println("The sum of even digit numbers are :" + sum);
        sc.close();
	}
	
}	