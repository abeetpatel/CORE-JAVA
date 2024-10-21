package com.rays.javaoop.dataabstraction;

public class Circle extends Shape {

	private int r;

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int r) {

		this.r = r;

	}

	@Override
	public double area() {

		double area = 3.14 * r * r;

		return area;

	}
	
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		
		System.out.println(c.area());
		
	}

}
