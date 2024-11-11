package practiceIO;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadDataFromKeyBoard {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your data, type 'bye' for exit...");
		
		PrintWriter pw = new PrintWriter(new FileWriter("D://IO//practice.txt"));
		
		String line = br.readLine();
		
		while (!line.equals("bye")) {
			
			String[] parts = line.split(" ");
			
			for( String part : parts) {
				
				pw.write(part+" \n");
				
				System.out.println(part);
				
			}
			
			line = br.readLine();
			
			pw.close();
			
		}
		
	}

}
