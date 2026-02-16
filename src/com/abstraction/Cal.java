package com.abstraction;

public class Cal implements Calculator {

public void add() {
		System.out.println("Addition"+(a+b));
	}
public void sub() {
	System.out.println("Substraction"+(a-b));
}
public void mul(int c ,int d) {
	System.out.println("Multiplication "+(c*d));
}
public void div(int c,int d) {
	System.out.println("Division"+(c/d));
}
}
