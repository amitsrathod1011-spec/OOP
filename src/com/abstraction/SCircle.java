package com.abstraction;

public class SCircle implements Shape {
	
	public void area(int a,int b) {
		System.out.println("Circle Area : "+(3.14*a*a));
	}
		
	public void perimeter(int a,int b) {
		System.out.println("Circle Perimeter:"+(2*3.14*a));
	}
}
