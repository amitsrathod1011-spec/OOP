package com.inheritance;

public class Carmain {
	public static void main(String[] args) {
		System.err.println("-----------------------------");
		System.out.println("welcome the Bmw car");
		Bmw b = new Bmw();
		
	b.color = "red";
	 b.model = "Q7";
		 b.price = 22435676;
		 System.out.println(b.color);
		 System.out.println(b.model);
		 System.out.println(b.color);
		b.myEngine();
		b.myStering();
		b.autoPark();
		
		System.err.println("-----------------------------");
		System.out.println("welcome the MG car ");
		
		MG m=new MG();
		m.color="black";
		m.model="mghecter";
		m.price=234567;
		System.out.println(m.color);
		System.out.println(m.model);
		System.out.println(m.price);
		m.DriveMode();
	}
}
