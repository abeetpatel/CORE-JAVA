package com.rays.basic;

public class MethodExample {

	public void add(int i, int c) {

		System.out.println("sum of two no = " + (i + c));

	}

	public void substraction(int i, int c) {

		System.out.println("subs of two no = " + (i - c));

	}
	
	public static void main(String[] args) {
		
		MethodExample m = new MethodExample();
		
		m.add(5, 10);
		m.substraction(15, 10);
		
	}

}
