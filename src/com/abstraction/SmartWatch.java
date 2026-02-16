package com.abstraction;

public class SmartWatch implements SmartHeartRateMonitor , SmartStepCounter{
	
	private String userName;
	private int steps;
	
	public SmartWatch(String userName ) {
		this.userName=userName;
		this.steps=40;
	}
	
	

	@Override
	public void measureHeartRate(int rate) {
		System.out.println("Heart Rate of  "+userName +" is : "+rate);
		System.out.println(steps);
		
		
	}
	@Override
	public void countSteps() {
		System.out.println("Total Steps Count: "+ steps);
	}
}
