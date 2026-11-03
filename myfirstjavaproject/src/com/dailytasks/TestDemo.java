package com.dailytasks;

class Shape{
	
	void area() {
		System.out.println("calculating the area of the Shape !!");
	}
	
}

class Rectangle extends Shape{
	int length =10;
	int breadth =15;
	
	@Override
	void area() {
		int result = length * breadth;
		System.out.println("The Area of the Rectangle is : " +  result);
	}
}

class Circle extends Shape{
	double radius =0.5;

	@Override
	void area() {
		double result = 3.14*radius*radius;
		System.out.println("The Area of the Circle is : " + result);
	}
}

public class TestDemo {
	  public static void main(String[] args) {
		  
    Shape s;

    s = new Circle();
    s.area();

    s = new Rectangle();
    s.area();
    
  }
}
