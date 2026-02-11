package com.polymorphism;

public class Login {
	
	
	
	void login(String email,String password) {
		System.out.println("Enter your email");
		System.out.println(email);
		System.out.println("Enter your password");
		System.out.println(password);
		
	}
	
	void login(String mobilNumber,int otp) {
		System.out.println("Enter your MobileNumber");
		System.out.println(mobilNumber);
		System.out.println("Enter your otp");
		System.out.println(otp);
	}
	
	void login(String googleAccount) {
		System.out.println("Enter your googleAccount");
		System.out.println(googleAccount);
		
	}
	
	
	public static void main(String[] args) {
		Login l=new Login();
		l.login("amitrathod101@gmail.com", "12354965");
		l.login("482838493", 12457);
		l.login("243454");
		System.out.println("Login Successful");
	}
	
}
