package com.rays.io;

import java.io.FileWriter;

public class TextFileWriter {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("D://IO//Abeet.txt",true);

		char[] ch = { 'h', 'i' };

		// fw.write(12);
		fw.write(ch);
		fw.write(',');
		fw.write("SunilOS");

		System.out.println("data write successfully");

		fw.close();

	}

}
