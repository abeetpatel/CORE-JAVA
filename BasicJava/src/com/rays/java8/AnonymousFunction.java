package com.rays.java8;

public class AnonymousFunction {

	public static void main(String[] args) {

		// Anonymous Function
		FunctionalInt f = new FunctionalInt() {

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		};

		int a = 10;
		int b = 5;

		System.out.println(f.sum(a, b));

	}

}
