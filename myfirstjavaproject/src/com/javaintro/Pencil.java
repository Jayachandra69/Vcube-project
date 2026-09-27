package com.javaintro;

public class Pencil {

	public static void main(String[] args) {
		int money =100;
		int pencilCost =7;
		int pencils =money/ pencilCost;
		int amountLeft = money % pencilCost;
		
		System.out.println("Money Avalaible :"+ money + "rupees");
		System.out.println("Cost of one pencil :"+ pencilCost + "rupees");
		System.out.println("Number of pencils bought :" + pencils);
		System.out.println("Amount left after shopping :"+ amountLeft +"rupees");

	}

}
