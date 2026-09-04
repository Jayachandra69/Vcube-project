package com.langfundamentals;

import java.util.Scanner;

 public class Company {
	
    String EmployeeName;
	double Salary;
	String CompanyName;
	
	public Company(String EmployeeName,double Salary,String CompanyName){
	    this.EmployeeName = EmployeeName;
		this.Salary = Salary ;
		this.CompanyName = CompanyName;	
	}
	
	     void display() {
		
		System.out.println("************Employee Details*************");
		System.out.println("Empolyee Name is :"+ EmployeeName);
		System.out.println("Salary is :"+ Salary);
		System.out.println("CompanyName is :"+ CompanyName);
	}

        public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first Employee Name :");
		String name1 =sc.nextLine();
		
		System.out.println("Enter first Salary Details :");
		double salary1 = sc.nextDouble();
		
		System.out.println("Enter first Company Name :" );
		sc.nextLine();
		String Company1=sc.nextLine();
		
		System.out.println("Enter second Employee Name :");
		String name2=sc.nextLine();
		
		System.out.println("Enter second Salary Details :");
		double salary2 = sc.nextDouble();
		
		System.out.println("Enter second Company Name :");
		sc.nextLine();
		String Company2 =sc.nextLine();
		
		 Company c1 = new  Company(name1,salary1,Company1);
		 Company c2 = new  Company(name2,salary2,Company2);
		
		c1.display();
		c2.display();
		
		sc.close();
		


	}

}
