package com.polymorphism;

public class Area {
	
	void area(int a) {
		System.out.println("Area of Radius = " +( a * a * 3.14));
	}

	void area(int length, int width) {
		System.out.println("Area of Rectangle = " + (length * width));
	}

	void area(int side, boolean square) {
		System.out.println("Area of Square = " + (side * side));
	}

	void area(int base, int height, boolean triangle) {
		System.out.println("Area of Triangle = " +( 0.5 * base * height));
	}

	public static void main(String[] args) {
		Area a = new Area();
		a.area(4);
		a.area(40, 20);
		a.area(12, true);
		a.area(2, 4, true);
	}
}
