package com.Snippets;

public class Test03 {
	
	int salary = 10000;
	
	Test03(int salary){
		salary = salary;
	}
	
	void display(){
		System.out.println(salary);
	}

	public static void main(String[] args) {
		
		Test03 t = new Test03(50000);
		t.display();
	}
}
