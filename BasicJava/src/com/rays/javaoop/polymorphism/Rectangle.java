package com.rays.javaoop.polymorphism;

public class Rectangle extends Shape {

	private int length;

	private int width;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int l, int w) {

		this.length = l;
		this.width = w;

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double area() {

		double area = length * width;

		return area;
	}

}
