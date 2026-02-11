package com.inheritance;

public class Dog extends Animal {
	
	public void speed() {
		System.out.println("very high speed of dogs");
	}
	@Override
	public void sound() {
		System.out.println("Especially the barking sound of dogs is very loud");
	}
}
