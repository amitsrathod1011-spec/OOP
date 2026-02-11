package com.polymorphism;

public class Payment {
	void pay(int amount) {
		System.out.println("payment "+amount+" done by  cash");
	}
	void pay (String Card,int cardNo) {
		System.out.println("Payment done using "+Card+" card.");
		System.out.println("Card Number"+cardNo);
	}
	void pay(long UPIID) {
		System.out.println("UPIID no:"+UPIID);
	}
	
	public static void main(String[] args) {
		Payment p=new Payment();
		p.pay(2233);
		p.pay("Credit",4525);
		p.pay(45258789655l);
	}
}
