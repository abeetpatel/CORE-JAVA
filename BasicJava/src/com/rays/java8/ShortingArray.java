package com.rays.java8;

import java.util.Arrays;

public class ShortingArray {

	public static void main(String[] args) {

		int[] a = { 5, 10, 2, 1, 3, 4 };

		Arrays.parallelSort(a);

		for(int b : a) {
			
			System.out.println(b);
			
		}

	}

}
