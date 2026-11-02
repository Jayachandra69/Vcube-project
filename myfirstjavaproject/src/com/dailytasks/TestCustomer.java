package com.dailytasks;

public class TestCustomer {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		address add = new address("pune");
		Customer c1 = new Customer(1,"JC",add);
		
		System.out.println("Before Shallow copy !! ");
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address.city);
		System.out.println("*************************");
		
		Customer c2 = (Customer) c1.clone();
		
		c2.cid = 2;
		c2.cname = "Chinnu";
		c2.address.city = "Banglore";
		
		System.out.println(c2.cid);
		System.out.println(c2.cname);
		System.out.println(c2.address.city);
		System.out.println("-------------------------");
		
		System.out.println("After Shallow copy !! ");
		System.out.println(c1.cid);
		System.out.println(c1.cname);
		System.out.println(c1.address.city);
		
		}
}
