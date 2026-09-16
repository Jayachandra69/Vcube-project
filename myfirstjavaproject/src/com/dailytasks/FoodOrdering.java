package com.dailytasks;

import java.util.Scanner;

public class FoodOrdering {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int choice , quantity;
		int price;
		String item ="";
		
		System.out.println("-----------FOOD MENU------------");
		System.out.println("1.Pizza - 200");
		System.out.println("2.Burger - 120");
		System.out.println("3.Biryani - 130");
		System.out.println("4.Noodles - 100");
		
		System.out.println("Enter your choice Number :");
		choice =sc.nextInt();
		
		switch(choice) {
		
		case 1:
			item = "Pizza";
			price = 200;
			break;
			
		case 2:
			item = "Burger";
			price = 120;
			break;
			
		case 3:
			item = "Biryani";
			price = 130;
			break;
			
		case 4:
			item = "Noodles";
			price = 100;
			break;
			
			default :
				System.out.println("Invalid Choice !!");
				sc.close();
				return;
		
		}
		
		System.out.println("Enter the Quantity :");
		quantity =sc.nextInt();
		
		int totalBill = price * quantity;
		
		
		System.out.println("---------------Billing details---------------");
		System.out.println("Selected item :" +item);
		System.out.println("Price         :"+price);
		System.out.println("Quantity      :"+quantity);
		System.out.println("Total Bill    :"+totalBill);
		
		sc.close();
		

	}

}
