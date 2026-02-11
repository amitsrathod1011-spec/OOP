package com.scanner;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		int i=0;
		while(num>i) {
			int c= a+b;
		System.out.println(c);
		a=b;
		b=c;
		i++;
		}sc.close();
	}
}
