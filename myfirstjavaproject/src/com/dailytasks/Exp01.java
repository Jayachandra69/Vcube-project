package com.dailytasks;

class Device{
	
	private String brand;
	private Double price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	void DisplayDetails() {
		System.out.println("Brand of the product is : " + brand);
		System.out.println("Price of the Product is : " + price);
		System.out.println("Display method called from Device !!");
	}

}

class Laptop extends Device{
	
	private int ram;
	private String processor;
	
	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	void runIDE() {
		System.out.println("runIDE Method called !!");
	}
	
	void compilecode() {
		System.out.println("compilecode Method called !!");
	}
	
	@Override
	void DisplayDetails() {
		System.out.println("Display method called from Laptop !!");
		System.out.println("Brand :" + getBrand());
		System.out.println("price :" + getPrice());
		System.out.println("Ram :" + getRam());
		System.out.println("processor :" + getProcessor());
	}
	
}

class Mobile extends Device{
	
	private String camera;
	private int battery;
	
	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	void makeCall() {
		System.out.println("makeCall method called !!");
	}
	
	void takePhoto() {
	    System.out.println("takePhoto method called !!");
	}
	
	@Override
	void DisplayDetails() {
		System.out.println("Display method called from Mobile !!");
		System.out.println("Brand :" + getBrand());
		System.out.println("price :" + getPrice());
		System.out.println("Battery :" + getBattery());
		System.out.println("Camera :" + getCamera());
	}
}


public class Exp01 {
	
	public static void main(String[] args) {
		
		
		Laptop lp = new Laptop();
		lp.setBrand("Samsung");
		lp.setPrice(65000.00);
		lp.setRam(8);
		lp.setProcessor("Intel core i7");
		lp.DisplayDetails();
		
		Mobile mb = new Mobile();
		mb.setBrand("Vivo");
		mb.setPrice(25000.00);
		mb.setCamera("50 mp back & 16 mp front");
		mb.setBattery(5500);
		System.out.println();
		mb.DisplayDetails();
		
//		Calling child specific methods !!
		System.out.println();
		lp.runIDE();
		lp.compilecode();
		System.out.println();
		mb.makeCall();
		mb.takePhoto();

	}

}
