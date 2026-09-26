package com.constructors;

public class car {
	
	String model;
	String brand;
	double price;
	int year;
	String color;
	
	car(){
		System.out.println("No-Arg Constructor called !!");
	}
	
	car(String model, String brand){
		System.out.println("2 Arg Constructor called !!");
		this.model = model;
		this.brand = brand;
	}
	
	car(String model, String brand, double price){
		System.out.println("3 Arg Constructor called !!");
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	car(String model, String brand, double price, int year){
		System.out.println("4 Arg Constructor called !!");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	
	car(String model, String brand, double price, int year, String color){
		System.out.println("5 Arg Constructor called !!");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.year = year;
		this.color = color;
	}


	public static void main(String[] args) {
		System.out.println("Welcome to the Vcube car show-room !!");
		
		car c1 = new car();
		c1.carInfo();
		
		car c2 = new car(" M2 "," BMW ");
		c2.carInfo();
		
		car c3 = new car(" M3 "," BMW ",8000000.00);
		c3.carInfo();
		
		car c4 = new car(" M4-CS "," BMW ",9500000.00,2025);
		c4.carInfo();
		
		car c5 = new car(" M5-CS "," BMW ",12000000.00,2026,"RED");
		c5.carInfo();

	}
	
	void carInfo() {
		System.out.println("The Model of the Car is : " + model);
		System.out.println("The brand of the Car is : " + brand);
		System.out.println("The price of the Car is : " + price);
		System.out.println("The year of the Car is : " + year);
		System.out.println("The color of the Car is : " + color);
		System.out.println("******************************************");
	}

}
