package com.inheritance;

public class Tmain {
	public static void main(String[] args) {

		Tjio user = new Tjio();

		user.recharge();
		System.out.println(user.Customercare());

		if (user.Internet()) {
			System.out.println("Internet is active");
		}
		
		user.jioPlan();
	}
}