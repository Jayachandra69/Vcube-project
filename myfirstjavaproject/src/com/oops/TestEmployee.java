package com.oops;

public class TestEmployee {
	
	public static void main(String[] args) {
	Employee e1=new Employee();
	e1.setEid(1);
	e1.setEname("JC");
	e1.setEsal(200000.00);
	
	System.out.println(e1.getEid());
	System.out.println(e1.getEname());
	System.out.println(e1.getEsal());
	}
}
