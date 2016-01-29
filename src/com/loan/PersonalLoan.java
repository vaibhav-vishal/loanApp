package com.loan;

public class PersonalLoan extends Loan {
	public void interestCalculate(Customer cust){
		loanAmnt = 12 * cust.CustomerSalary;
		if(loanAmnt<50000){
			System.out.println("Loan Amount - " + loanAmnt);
			System.out.println("Interest Rate is 14% per annum");
		}
		else{
			System.out.println("Loan Amount - " + loanAmnt);
			System.out.println("Interest Rate is 13% per annum");
		}
	}
}
