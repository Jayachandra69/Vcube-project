package com.langfundamentals;

public class example2 {
	int x=2;
	int y=3;
	int z= (x++)-(--y)-x+y-(x--)+(y--);

	public static void main(String[] args) {
		example2 e =new example2 ();
		System.out.println(e.z);

	}

}
