package com.abstraction;

public class PaymentGateway implements PUPIPayment , PCardPayment {
	@Override
	public void payUsingUPI() {
		 System.out.println("payment done through the UPI" );
	 }
	@Override
	 public void payUsingCard() {
		 System.out.println("Payment done through the Card");
	 }
	 
	 public static void main(String[] args) {
		 PaymentGateway pay=new PaymentGateway();
		 pay.payUsingUPI();
		 pay.payUsingCard();
	 }
}
