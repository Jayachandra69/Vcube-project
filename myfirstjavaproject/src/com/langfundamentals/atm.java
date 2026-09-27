package com.langfundamentals;

public class atm {
	
	static String bankName = "Vcube";
	long accountNumber;
	double balance;
	
	void deposit(double amount) {
  	  balance = balance + amount;
    }
    void withdraw(double amount) {
  	  balance = balance - amount;
    }
    void checkbalance() {
  	  System.out.println("Current balance :"+ balance);
  	  
    }

	public static void main(String[] args) {
		
		atm account1=new atm();
		account1.deposit(100000.00);
		account1.withdraw(25000.00);
		account1.checkbalance();
		
		atm account2=new atm(); 
		account2.deposit(330000.00);
		account2.withdraw(81000.00);
		account2.checkbalance();

		

	}

}
