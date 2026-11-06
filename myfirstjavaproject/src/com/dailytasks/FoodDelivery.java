package com.dailytasks;

class Delivery{
	
	long deliveryId;
	String partnerName;
	double distance;
	
	public Delivery(long deliveryId, String partnerName, double distance) {
		super();
		this.deliveryId = deliveryId;
		this.partnerName = partnerName;
		this.distance = distance;
	}

	public void CalculateDeliveryCharge() {
	}	
}

class BikeDelivery extends Delivery{
	
	public BikeDelivery(long deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	public void CalculateDeliveryCharge() {
		double charge = distance *10;
		
		System.out.println("Delivery id is :" + deliveryId);
		System.out.println("Partner Name is :" + partnerName);
		System.out.println("The Distance is :" + distance + " km");
		System.out.println("The Type of Delivery : Bike Delivery ");
		System.out.println("The amount calculated for this order is : " + charge);
	}
		
}

class CycleDelivery extends Delivery{
	
	public CycleDelivery(long deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	public void CalculateDeliveryCharge() {
		double charge = distance *5;
		
		System.out.println("Delivery id is :" + deliveryId);
		System.out.println("Partner Name is :" + partnerName);
		System.out.println("The Distance is :" + distance + " km");
		System.out.println("The Type of Delivery : Cycle Delivery ");
		System.out.println("The amount calculated for this order is : " + charge);
	}
	
}

class ExpressDelivery extends Delivery{
	
	public ExpressDelivery(long deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	public void CalculateDeliveryCharge() {
		double charge = distance *20;
		
		System.out.println("Delivery id is :" + deliveryId);
		System.out.println("Partner Name is :" + partnerName);
		System.out.println("The Distance is :" + distance + " km");
		System.out.println("The Type of Delivery : Express Delivery ");
		System.out.println("The amount calculated for this order is : " + charge);
	}
	
}

public class FoodDelivery {

	public static void main(String[] args) {
		
		Delivery d1= new BikeDelivery(1,"Rahul",7.6);
		Delivery d2= new CycleDelivery(2,"Vishnu",5.8);
		Delivery d3= new ExpressDelivery(3,"Nani",6.7);
		
		d1.CalculateDeliveryCharge();
		System.out.println("\n************************************************");
		d2.CalculateDeliveryCharge();
		System.out.println("\n************************************************");
		d3.CalculateDeliveryCharge();
	}

}
