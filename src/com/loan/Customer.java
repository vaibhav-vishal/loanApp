package com.loan;

public class Customer {
	public String CustomerName;
	public double CustomerSalary;
	public long goldGram;
	
	public Customer(String cName, double cSal){
		CustomerName = cName;
		CustomerSalary = cSal;
	}
	public Customer(String cName, long gGram){
		CustomerName = cName;
		goldGram = gGram;
	}
}
