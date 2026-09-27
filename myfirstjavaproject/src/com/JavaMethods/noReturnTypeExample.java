package com.JavaMethods;

public class noReturnTypeExample {
	
	void Addition(int a, int b) {
	     System.out.println("Addition :"+ (a+b));
	}
	
    void subtraction(int a,int b) {
	     System.out.println("Subtraction :"+ (a-b));
		}
    
    void Multiplication(int a ,int b) {
	     System.out.println("Multiplication :"+ (a*b));
		
	}
    
    void Division(int a, int b) {
	     System.out.println("Division :"+ (a/b));
    	
    }
    
    void callAllMethods() {
    	
    	Addition(200, 100);
    	subtraction(200, 100);
    	Multiplication(200, 100);
    	Division(200, 100);
    }

	 void main(String[] args) {
		 
		 callAllMethods();

	}

}
