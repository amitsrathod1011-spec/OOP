//Write a program to create a class Student with a non-parameterized constructor that prints “Welcome Student”.
// Write a program with a parameterized constructor to initialize id and name of a Student and display them. 
package com.constructor;

public class Student {
    int Id;
    String name;

    // Non-parameterized constructor
    Student() {
        System.out.println("Welcome Student");
    }

    // Parameterized constructor
    Student(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s = new Student();              // calls default constructor
        Student s1 = new Student(1, "Amit");    // calls parameterized constructor

        System.out.println(s);
        System.out.println(s1.Id);
        System.out.println(s1.name);
    }
}
