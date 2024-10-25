package abeet.patel.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadDataFromKeyboard { 
	
	public static void main(String[] args) throws Exception {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Enter Your Data (Type 'bye' to exit) : ");
		
		PrintWriter pr = new PrintWriter(new FileWriter("D://IO//key.txt"));
		
		String line = br.readLine();
		
		while(!line.equals("bye")) {
			
			String[] parts = line.split(" ");
			
			for(String part : parts) {
				
				pr.write(part + "\n");
				
				System.out.println(part);
				
			}
			
			line = br.readLine();
			
		}
		
		pr.close();
		
	}

}
