package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadCurrectEmail {

	public static void main(String[] args) throws Exception {

		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IO\\CurrectEmailList.txt"));
		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\EmailList.txt"));

		String email;
		String emailReg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		while ((email = br.readLine()) != null) { // Read each line until the end of the file
			if (email.matches(emailReg)) { // Check if the email matches the regex
				System.out.println(email);
				bw.write(email); // Write the email to the file
				bw.newLine(); // Add a newline character
			}
		}

		System.out.println("Emails written successfully");

		bw.close();
		br.close();
	}
}
