package com.JavaMethods;

import java.util.Scanner;

/// 2)No Return Type + With Parameters
//---> Reading values from console using  Scanner !!

public class Methods2 {

	public static void main(String[] args) {
     System.out.println("Main method Started !!");
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter id :");
     int id = sc.nextInt();
     
     System.out.println("Enter name :");
     sc.nextLine();
     String Name = sc.nextLine();
     
     System.out.println("Enter city Name :");
     String CityName =sc.nextLine();
     
     System.out.println("Enter phone no : ");
     long phone = sc.nextLong();
     
     getCustomerId(id);
     getCustomerName(Name);
     getCustomerPhone(phone);
     getCustomerCity(CityName);
     
     sc.close();
     System.out.println("Main method Ended !!");
	}
	
	static void getCustomerId(int id) {
		System.out.println("Customer ID is :" + id);
		
	}
	static void getCustomerName(String Name){
		
		System.out.println("Name of the customer is :" + Name);
	}
	static void getCustomerPhone(long phone) {
		
		System.out.println("Phone number is :" + phone);
	}
	static void getCustomerCity(String CityName) {
	    System.out.println("Name of the city is :"+ CityName);
	}
}