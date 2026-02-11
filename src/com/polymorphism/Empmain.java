package com.polymorphism;

public class Empmain {
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.salary(0);
		
		Employee m=new EManager();
		m.salary(50000);
		
		Employee d=new EDeveloper();
		d.salary(50000);
		
		Employee i=new EIntern();
		i.salary(23444);
		
		
	}
}
