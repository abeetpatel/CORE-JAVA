package com.rays.java8;

public class LembdaExpression {

	public static void main(String[] args) {

		FunctionalInt f = (a, b) -> {
			return a + b;
		};

		int a = 10;
		int b = 15;

		System.out.println(f.sum(a, b));

	}

}
