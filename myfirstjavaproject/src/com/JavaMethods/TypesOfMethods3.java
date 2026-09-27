package com.JavaMethods;

///2)no return type + with parameters
public class TypesOfMethods3 {
	
	public static void main(String[] args) {
		
		System.out.println("Main method started !!");
		TypesOfMethods3 t3 =new TypesOfMethods3();
		
//		 CALL BY VALUE
		t3.getPersonName("Jayachandra");//----->Arguments
		t3.getAge(22);
		t3.getHeight(5.8f);
		
		System.out.println("Main method ended !!");
	}
	
//	PARAMETRES --------> ex: string name , int Age
	void getPersonName(String Name) {
		System.out.println("Name of the person :"+ Name);
		}
	void getAge(int Age) {
		System.out.println("Age of the person :"+ Age);
	}
	void getHeight(float Height) {
		System.out.println("height of the person :"+ Height);
		}
}
