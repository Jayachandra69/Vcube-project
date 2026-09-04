package com.langfundamentals;

public class Employee {
	
	String EmployeeName;
	int MonthlySalary;
	Double MonthlyGst;
	Double MonthlyPf;
	Double NetMonthlySalary;
	Double AnnualGst;
	Double AnnualPf;
	Double AnnualNetSalary;
	
	public Employee(String EmployeeName, int MonthlySalary) {
		this.EmployeeName= EmployeeName;
		this.MonthlySalary = MonthlySalary;
	}
	
	public void calculateMonthlyPf() {
		MonthlyPf = MonthlySalary*0.02;
	}
	
	public void calculateMonthlyGst() {
		MonthlyGst = MonthlySalary*0.03;
	}
	public void calculateNetMonthlySalary() {
		NetMonthlySalary = MonthlySalary - MonthlyGst - MonthlyPf ;
	}
	
	public void calculateAnnualGst() {
		AnnualGst = MonthlyGst*12;
	}
	
	public void calculateAnnualPf() {
		AnnualPf = MonthlyPf*12;
	}
	public void calculateAnnualNetSalary() {
		AnnualNetSalary = NetMonthlySalary*12;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("***************Employee Details*****************");
		System.out.println("Employee Name :" + EmployeeName);
		System.out.println("Monthly Salary :" + MonthlySalary);
		System.out.println("Monthly Gst :" + MonthlyGst);
		System.out.println("MonthlyPf " + MonthlyPf);
		System.out.println("Net Monthly Salary :" + NetMonthlySalary);
		System.out.println("Annual Gst :" + AnnualGst);
		System.out.println("Annual Pf :" + AnnualPf);
		System.out.println("Annual Net Salary :" + AnnualNetSalary);
	}

	public static void main(String[] args) {
		
	Employee emp = new Employee("Jayanth", 20000);
	
	emp.calculateMonthlyGst();
	emp.calculateMonthlyPf();
	emp.calculateNetMonthlySalary();
	emp.calculateAnnualGst();
	emp.calculateAnnualPf();
	emp.calculateAnnualNetSalary();
	emp.displayEmployeeDetails();
	

	}

}
