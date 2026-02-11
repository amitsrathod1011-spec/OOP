package com.polymorphism;

public class Student {
	void std() {
		System.out.println("Student Registration System");
	}
	void std(String name) {
		System.out.println("Enter your name");
		System.out.println(name);
	}
	void std(String name,int age ) {
		System.out.println("Enter your age");
		System.out.println(age);
	}
	void std(String name,int age ,String course) {
		System.out.println("Enter your course");
		System.out.println(course);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		s.std();
		s.std("Amit Rathod");
		s.std("Amit rathod",22);
		s.std("Amit Rathod", 22, "CSE");
	}
}
