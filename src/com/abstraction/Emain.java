package com.abstraction;

public class Emain {
	public static void main(String[] args) {
		Employee f=new FullTimeEmp();
		f.calSalary();
		
		Employee p=new PartTimeEmp();
		p.calSalary();
		
	}
}
