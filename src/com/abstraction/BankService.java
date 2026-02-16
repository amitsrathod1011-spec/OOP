package com.abstraction;

public class BankService implements BankLoanService , BankInsuranceService {
	public int balance =12000;
	@Override
	public void applyLoan(int amount) {
		System.out.println(amount);
		if(balance>= 100000) {
			System.out.println("✅ Loan Approved");
		}else {
			System.out.println("❌ Loan Not Approved (Insufficient balance)");
		}
	}
	
	@Override
	public void applyInsurance(String type) {
		if (type.equalsIgnoreCase("Health") || 
	            type.equalsIgnoreCase("Life") || 
	            type.equalsIgnoreCase("Vehicle")) {
		System.out.println("✅ " + type + " Insurance Applied Successfully");
		}
		else {
			 System.out.println("❌ Invalid Insurance Type");
		}
	}
	
	public static void main(String[] args) {
		BankService b= new BankService();
		b.applyLoan(500000);
		b.applyInsurance("Health");
	}
}
