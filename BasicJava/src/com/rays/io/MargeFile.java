package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MargeFile {
	
	public static void main(String[] args) throws IOException {

		FileWriter pw = new FileWriter("D:\\IO\\A1A2.txt");

		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\A1.txt"));

		String s1 = br.readLine();

		while (s1 != null) {

			pw.write(s1);

			s1 = br.readLine();

		}
		br.close();

		br = new BufferedReader(new FileReader("D:\\IO\\A2.txt"));

		String s2 = br.readLine();

		while (s2 != null) {

			pw.write(s2);

			s2 = br.readLine();

		}
		br.close();
		pw.close();

		System.out.println("success.......");

	}

}
