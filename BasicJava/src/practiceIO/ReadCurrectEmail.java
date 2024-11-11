package practiceIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadCurrectEmail {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\EmailList.txt")); 
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://IO//perfectemail.txt"));
		
		String email = br.readLine();
		
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		while (email != null) {
			
			if(email.matches(emailreg)) {
				
				System.out.println(email);
				
				bw.write(email);
				
				bw.newLine();
				
			}
			
			email = br.readLine();
			
		}
		
		System.out.println("process done.....");
		
		br.close();
		
		bw.close();
		
	}

}
