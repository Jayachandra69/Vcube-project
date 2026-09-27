package com.langfundamentals;

public class loanManagement {
	String customerName;
	double loanAmount;
    double intrestRate;
	int loanTenture;
	
	
	 double calculateIntrest(double loanAmount, double intrestRate){
		 double intrest =(loanAmount*intrestRate*loanTenture)/100;
		 return intrest;
		 
	 }
     double calculateTotalAmount(double intrest){
		 double TotalAmount= loanAmount + intrest;
		 return TotalAmount;
	 }
     double calculateMonthlyEMI(double TotalAmount , int loanTenture){
		double EMI = TotalAmount/(loanTenture*12);
		 return EMI;
	 }
     void displayLoanSummary(double intrest, double TotalAmount ,double EMI){
	 System.out.println("Enter the customer Name :" + customerName);
	 System.out.println("Enter the Loan Amount :" + loanAmount);
	 System.out.println("Enter the intrest rate :" + intrestRate);
	 System.out.println("Enter the Loan Tenture in years :" + loanTenture);
	 System.out.println("calculated intrest is :" + intrest);
	 System.out.println("Total amount is :" + TotalAmount);
	 System.out.println("Monthly EMI is :" + EMI);
	 
 }

	public static void main(String[] args) {
		
		loanManagement loan1 =new loanManagement();
		loanManagement loan2 =new loanManagement();
		
		loan1.customerName ="Jaya";
		loan1.loanAmount =200000.00;
		loan1.intrestRate =3;
		loan1.loanTenture =2;
		
		double intrest1 =loan1.calculateIntrest(loan1.loanAmount, loan1.intrestRate);
		double Amount1 =loan1.calculateTotalAmount(intrest1);
		double emi1 =loan1.calculateMonthlyEMI(Amount1, loan1.loanTenture);
		
		
		loan2.customerName ="JPR";
		loan2.loanAmount =450000.00;
		loan2.intrestRate =4;
		loan2.loanTenture =3;
		
		double intrest2 =loan2.calculateIntrest(loan2.loanAmount, loan2.intrestRate);
		double Amount2 =loan2.calculateTotalAmount(intrest2);
		double emi2 =loan2.calculateMonthlyEMI(Amount2, loan2.loanTenture);
		
		System.out.println("************** CUSTOMER-1 DETAILS ****************");
		loan1.displayLoanSummary(intrest1, Amount1, emi1);
		System.out.println("************** CUSTOMER-2 DETAILS ****************");
		loan2.displayLoanSummary(intrest2, Amount2, emi2);
		

	}

}
