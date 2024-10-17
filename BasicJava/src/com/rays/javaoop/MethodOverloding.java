package com.rays.javaoop;

// same method with different data types or different no of parameter
public class MethodOverloding {

	public void sum(int a, int b) {

		System.out.println("sum of two int no. = " + (a + b));

	}

	public void sum(double a, double b) {

		System.out.println("sum of two double no. = " + (a + b));

	}

	public void sum(int a, int b, int c) {

		System.out.println("sum of three int no. = " + (a + b + c));

	}

	public static void main(String[] args) {

		MethodOverloding m = new MethodOverloding();

		m.sum(5, 10);

	}

}
