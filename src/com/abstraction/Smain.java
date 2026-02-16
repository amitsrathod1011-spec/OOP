package com.abstraction;

public class Smain {
	public static void main(String[] args) {
		Shape s=new SCircle();
		s.area(2,4);
		s.perimeter(2,2);
		
		Shape r=new Srectangle();
		r.area(2,2);
		r.perimeter(1,1);
	}
}
