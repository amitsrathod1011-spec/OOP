package com.polymorphism;

public class Calculator {
	public void calculator(int a, int b) {
		System.out.println("Adding two interger no ="+(a+b));
	}
	public void calculator(int c, int d,int f) {
		System.out.println("Adding three interger no ="+(c+d+f));
	}
	public void calculator(double a, double b) {
		System.out.println("Adding two double no ="+(a+b));
	}
	public int  calculator(int b,int a ,boolean multiply) {
		
		return  a * b;
	}
	
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.calculator(41, 12);
		c.calculator(44, 14, 15);
		c.calculator(45.25, 3.14);
		System.out.println("Multiply two interger"+c.calculator(2, 3,true));
	}
}
