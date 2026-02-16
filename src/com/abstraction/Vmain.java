package com.abstraction;

public class Vmain {
	public static void main(String[] args) {
		Vehicle c=new Vcar();
		c.start();
		c.stop();
		
		Vehicle b=new Vbike();
		b.start();
		b.stop();
	}
}
