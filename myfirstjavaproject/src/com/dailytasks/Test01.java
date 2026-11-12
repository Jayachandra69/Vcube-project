package com.dailytasks;

public class Test01 {

	static int calculate(int n) {
		if(n<=1)
		  return 1;
		
		return n * calculate(n-2);
	}
	public static void main(String[] args) {
		System.out.println(calculate(7));
	}
}
 