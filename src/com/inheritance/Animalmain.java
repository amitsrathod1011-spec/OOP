package com.inheritance;

public class Animalmain {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.age = 2;
		d.type = "labrador";
		System.out.println("Age :"+d.age);
		System.out.println("Type :"+d.type);
		d.sound();
		d.speed();
		
		Animal s=new Dog();
		s.sound();
	}
}
