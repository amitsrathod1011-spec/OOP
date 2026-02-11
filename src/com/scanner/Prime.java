package com.scanner;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		boolean checkPrime=true;
		
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				checkPrime=false;
				break;
			}
		}
		if(checkPrime) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		sc.close();
	}
}