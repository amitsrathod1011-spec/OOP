package com.constructor;

public class area {

	int length;
	int width;

	area() {
		length = 10;
		width = 5;
	}

	public void result() {
		int totalArea = length * width;
		System.out.println(totalArea);
	}
}
