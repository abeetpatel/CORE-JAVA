package com.rays.javaoop;

public class TestCircle {
	
	public static void main(String[] args) {
		
		Shape s = new Circle(2);
		
		s.setColor("green");
		s.setBorderWidth(5);
		
		System.out.println(s.area());
		
	}

}
