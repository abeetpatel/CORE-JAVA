package com.rays.basic;

public class ExtractDublicateCharInString {
	public static void main(String[] args) {

		String str = "prajapati";

		
		// char[] ch = {'p', 'r', 'a' ----};
		char[] ch = str.toCharArray();

		int count = 0;

		for (int i = 0; i < ch.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';

				}

			}
			if (count > 1 && ch[i] != '0') {
				System.out.print(ch[i]);

			}

		}

	}

}