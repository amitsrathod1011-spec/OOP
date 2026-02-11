package com.polymorphism;

public class Vehiclemain {
	public static void main(String[] args) {
		Vehicle v=new Vehicle();
		v.speed();
		Vehicle b=new VBike();
		Vehicle c=	new VCar();
		c.speed();
		b.speed();
	}
}
