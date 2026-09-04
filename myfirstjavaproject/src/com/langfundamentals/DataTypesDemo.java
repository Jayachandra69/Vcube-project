package com.langfundamentals;

public class DataTypesDemo {
	
	byte b =127;
	//byte b1 =128;   -----> Type mismatch: cannot convert from int to byte.
	//byte min-max range is from -128 to 127
	//by default RHS numeric values are int type.
	// byte -----> 2^0 2^1 2^2 2^3 2^4 2^5 2^6 2^7 -------> 1+2+4+8+16+32+64=127.
	// 267 is MSB : Most Significiant Bit.
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	char c;
	
	boolean boo;
	

	public static void main(String[] args) {
		
		System.out.println("Main method started");
		DataTypesDemo t1= new DataTypesDemo ();
		
		System.out.println("byte value :" + t1.b);
		System.out.println("short value :"+ t1.s);
		System.out.println("int value :"+ t1.i);
		System.out.println("long value :"+ t1.l);
		System.out.println("float value :"+ t1.f);
		System.out.println("double value :"+ t1.d);
		System.out.println("char value :"+ t1.c);
		System.out.println("boolean value :"+ t1.boo);
		

	}

}
