package com.Arrays;
public class arr4 {

	public static void main(String[] args) {
		String [] names = {"Chinnu","Venny","Sunny","Rosy","Pinky"};
		
		for(int i=0;i<names.length;i++) {
			if(names[i].contains("y")) {
				System.out.println(names[i]);
			}
		}
	}
}
