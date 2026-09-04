package com.javaintro;
public class Cricketer {
	// Declaration
	// instance variable
	int jerseyNo;
	String cricketerName;
	// static variables
	static int countryId;
	static String countryName;
	public static void main(String[] args) {
		System.out.println("Welcome to Indian Cricket Team Info !");
		// Initialize the data
		countryId = 91;
		countryName = "India";
		// Accessing
		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println("******Object1 info ************");
		
        Cricketer rohit =new Cricketer();
        System.out.println("Country Id   : " + countryId);
        System.out.println("Country Name : " + countryName);
        rohit.jerseyNo=45;
        rohit.cricketerName="Rohit Sharma";
        System.out.println("Jersey Number :"+ rohit.jerseyNo);
        System.out.println("Cricketer Name :"+ rohit.cricketerName);
        
        System.out.println("******Object2 info ************");
		
        Cricketer vk =new Cricketer();
        System.out.println("Country Id   : " + countryId);
        System.out.println("Country Name : " + countryName);
        vk.jerseyNo=18;
        vk.cricketerName="Virat Kohli";
        System.out.println("Jersey Number :"+ vk.jerseyNo);
        System.out.println("Cricketer Name :"+ vk.cricketerName);
        
        countryId = 92;
		countryName = "Bharath";
        
		System.out.println("******Object3 info ************");
		
        Cricketer Dhoni =new Cricketer();
        System.out.println("Country Id   : " + countryId);
        System.out.println("Country Name : " + countryName);
        Dhoni.jerseyNo=7;
        Dhoni.cricketerName="Mahendra Singh Dhoni";
        System.out.println("Jersey Number :"+ Dhoni.jerseyNo);
        System.out.println("Cricketer Name :"+ Dhoni.cricketerName);
        
        countryId = 91;
		countryName = "India";
        
		System.out.println("******Object4 info ************");
		
        Cricketer Gill =new Cricketer();
        System.out.println("Country Id   : " + countryId);
        System.out.println("Country Name : " + countryName);
        Gill.jerseyNo=7;
        Gill.cricketerName="Shubman Gill";
        System.out.println("Jersey Number :"+ Gill.jerseyNo);
        System.out.println("Cricketer Name :"+ Gill.cricketerName);
	}
}
