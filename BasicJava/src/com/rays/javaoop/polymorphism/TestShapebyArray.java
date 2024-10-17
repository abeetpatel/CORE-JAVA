package com.rays.javaoop.polymorphism;

public class TestShapebyArray {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];

		s[0] = new Circle(2);

		s[1] = new Rectangle(5, 5);

		s[2] = new Triangle(5, 3);

		System.out.println(s[0].area());
		System.out.println(s[1].area());
		System.out.println(s[2].area());

	}

}
