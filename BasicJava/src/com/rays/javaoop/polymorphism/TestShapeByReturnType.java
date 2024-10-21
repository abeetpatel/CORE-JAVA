package com.rays.javaoop.polymorphism;

public class TestShapeByReturnType {

	public static void main(String[] args) {

		Shape[] s = new Shape[3];
		

		s[0] = Shape.getShape(1);

		s[1] = Shape.getShape(2);

		s[2] = Shape.getShape(3);

		Circle c = new Circle();

		c.setRadius(2);

		System.out.println(c.area());

	}

}
