package com.abstraction;

public class EmpTechLead {
	public void teach() {
		System.out.println(" Tech Lead is teaching team members 👨‍🏫 ");
	}
	public void developProject() {
		System.out.println("  Tech Lead is developing the project 💻 ");
	}
	public static void main(String[] args) {
		EmpTechLead e=new EmpTechLead();
		e.teach();
		e.developProject();
	}
}
