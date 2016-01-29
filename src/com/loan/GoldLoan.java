package com.loan;

public class GoldLoan extends Loan{
	public void interestCalculate(Customer cust){
		loanAmnt = 2000 * cust.goldGram;
		if(cust.goldGram < 100){
			System.out.println("Loan Amount - " + loanAmnt);
			System.out.println("Interest Rate is 10% per annum");
		}
		else{
			System.out.println("Loan Amount - " + loanAmnt);
			System.out.println("Interest Rate is 11% per annum");
		}
	}
}
