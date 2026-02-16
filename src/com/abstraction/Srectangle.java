package com.abstraction;

public class Srectangle implements Shape{
	public void area(int a, int b) {
		System.out.println("Rectangle Area: "+(a*b));
	}
		
	public void perimeter(int b, int a) {
		System.out.println("Rectangle Perimeter: "+(2*(a*b)));
	}
}
