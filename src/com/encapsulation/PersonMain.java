package com.encapsulation;

public class PersonMain {
	public static void main(String[] args) {
		Person p=new Person();
	p.setName("Amit");
		p.setAge(23);
		System.out.println(p.getAge());
		System.out.println(p.getName());
	}
}
