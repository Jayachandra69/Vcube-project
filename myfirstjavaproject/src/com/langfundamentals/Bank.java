package com.langfundamentals;

import java.util.Scanner;

public class Bank {
	double balance =25000;

	void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to Vcube Bank!!");
			System.out.println("Available balance is :"+ balance);
			System.out.println("Enter the deposit amount:");
			double amount =sc.nextDouble();
			deposit(amount);
			showbalance();
			System.out.println("Enter the withdraw amount:");
			double amount1 =sc.nextDouble();
			withdraw(amount1);
		}
		showbalance();
	}
      void deposit(double amount) {
    	  balance = balance + amount;
      }
      void withdraw(double amount) {
    	  balance = balance - amount;
      }
      void showbalance() {
    	  System.out.println("Current balance :"+ balance);
    	  
      }
}
