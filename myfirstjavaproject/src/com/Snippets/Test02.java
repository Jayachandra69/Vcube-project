package com.Snippets;

public class Test02 {
	{
		System.out.println("Instance Block !!");
	}
	Test02(){
		System.out.println("Constructor Called !!");
	}

	public static void main(String[] args) {
		
		Test02 t1 = new Test02();
		Test02 t2 = new Test02();
	}
}
