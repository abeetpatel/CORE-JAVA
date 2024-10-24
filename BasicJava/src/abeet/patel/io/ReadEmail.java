package abeet.patel.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadEmail {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter( new FileWriter("D:\\IO\\Valid Emails.txt"));
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\EmailList.txt"));
		
		String email;
		
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		while ( (email = br.readLine()) != null) {
			
			if(email.matches(emailreg)) {
				
				bw.write(email);
				
				bw.newLine();
				
			}
		}	
			System.out.println("Done");
			
			br.close();
			
			bw.close();
			
		
		
	}

}
