package com.langfundamentals;

public class courier {
	
	String customerName;
	int courierid;
	String source;
	String destination;
	double weight;
	double deliveryAmount;
	
	static int totalCouriers;
	static double totalWeight;
	static double totalAmountCollected;
	static int priceperkg =100;
	
	static {
		
		System.out.println("Welcome to Quickship Courier");
	}
	
	void bookcourier() {
		deliveryAmount=weight*priceperkg;
		totalCouriers++ ;
		totalWeight =totalWeight + weight ;
		totalAmountCollected =totalAmountCollected + deliveryAmount;
		
		System.out.println("Courier Booked Sucessfully !!");
		System.out.println("CourierId :" + courierid);
		System.out.println("Delivery Amount : " + deliveryAmount);
		System.out.println();
	}
	
	void displayCourierDetails() {
		
		System.out.println("**************Courier Details*****************");
		System.out.println("Customer Name :"+ customerName);
		System.out.println("Courier Id :" + courierid);
		System.out.println("Source :" + source);
		System.out.println("Destination :"+ destination);
		System.out.println("Weight :"+ weight);
		System.out.println("delivery Amount :"+ deliveryAmount);
		System.out.println();
	}
	
	static void displayTodayscollection() {
		
		System.out.println("***********Today collection***********");
		System.out.println("Total couriers booked :"+ totalCouriers);
		System.out.println("Total Weight :" + totalWeight);
		System.out.println("Total Amount Collected :" + totalAmountCollected);
		System.out.println();
	}

	public static void main(String[] args) {
		
		courier c1 =new courier();
		c1.customerName = "Jayanth";
		c1.courierid = 1;
		c1.source = "chennai";
		c1.destination = "hyd";
		c1.weight = 10;
		
		c1.bookcourier();
		c1.displayCourierDetails();
		
		
		courier c2 =new courier();
		c2.customerName = "Jyothish";
		c2.courierid = 2;
		c2.source = "Banglore";
		c2.destination = "hyd";
		c2.weight = 8;
		c2.bookcourier();
		c2.displayCourierDetails();
		
		courier.displayTodayscollection();

	}

}
