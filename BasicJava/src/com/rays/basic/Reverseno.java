package com.rays.basic;

public class Reverseno {
	public static void main(String[] args) {

		int num = 587;
		int revs = 0;
		int num2 = num;
		int r = 0;

		while (num2 != 0) {

			r = num2 % 10;
			revs = revs * 10 + r;
			num2 = num2 / 10;

		}

		System.out.println(revs);

	}

}
