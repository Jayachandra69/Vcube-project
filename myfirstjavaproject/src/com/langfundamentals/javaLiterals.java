package com.langfundamentals;

public class javaLiterals {

	public static void main(String[] args) {
		
		float f1 =123;
		float f2 =0123;
//      float f3 =123.5; Type mismatch: cannot convert from double to float
		float f4 =123.5F;
		float f5 =0123.5F;
		float f6 =1234F;
		float f7 =0123F;
		float f8 =0x123F;
//    	float f9 =0x123.5F; Invalid hex literal number
//		float f10=0x123.5; Invalid hex literal number
		
		System.out.println(f1);
		System.out.println(f2);
//		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
//		System.out.println(f9);
//		System.out.println(f10);
	}

}
