package com.constructors;

// constructor chaining : It is the method of calling one constructor into another constructor through this() !!

public class bike {
	
	String model;
	String brand;
	double price;
	int year;
	String color;
	
	bike(){
		this("GT 650","ROYAL ENFIELD");
		System.out.println(" No-Arg constructor Called !! ");
	}
	
	public bike(String model, String brand) {
		this(model,brand,450000.00);
		System.out.println(" 2 Arg constructor Called !! ");
	}
	
	public bike(String model, String brand, double price) {
		this(model,brand,price,2026);
		System.out.println(" 3 Arg constructor Called !! ");
	}
	
	public bike(String model, String brand, double price, int year) {
		this(model,brand,price,year,"MR-CLEAN");
		System.out.println(" 4 Arg constructor Called !! ");
	}
	

	public bike(String model, String brand, double price, int year, String color) {
		this.model = model;
        this.brand = brand;
        this.price = price;
        this.year = year;
        this.color = color;
		System.out.println(" 5 Arg constructor called !!");
	}



	public static void main(String[] args) {
		
		System.out.println(" Welcome to the Vcube Bike show-room !! ");
		
		bike b1 = new bike();
		b1.bikeInfo();
		
		bike b2 = new bike("GT 650","ROYAL ENFIELD");
		b2.bikeInfo();
		
		bike b3 = new bike("GT 650","ROYAL ENFIELD",450000.00);
		b3.bikeInfo();
		
		bike b4 = new bike("GT 650","ROYAL ENFIELD",450000.00,2026);
		b4.bikeInfo();
		
		bike b5 = new bike("GT 650","ROYAL ENFIELD",450000.00,2026,"MR-CLEAN");
		b5.bikeInfo();

	}
	
	void bikeInfo() {
		System.out.println("The Model of the bike is : " + model);
		System.out.println("The brand of the bike is : " + brand);
		System.out.println("The price of the bike is : " + price);
		System.out.println("The year of the bike is : " + year);
		System.out.println("The color of the bike is : " + color);
		System.out.println("******************************************");
	}


}
