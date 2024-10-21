package com.rays.exception;

public class TestException {

	public static void main(String[] args) {

		int i = 5;

		try {

			int div = i / 0;

			System.out.println(div);

		} catch (NullPointerException e) {

			System.out.println("in catch block "+ e.getMessage());

		} finally {
			System.out.println("this is finally block");
		}

		//System.out.println("program complited");

	}

}
