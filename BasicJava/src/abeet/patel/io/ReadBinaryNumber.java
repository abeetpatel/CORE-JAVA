package abeet.patel.io;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class ReadBinaryNumber {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("D:\\IO\\rays.png");
		
		FileOutputStream out = new FileOutputStream("D:\\IO\\rays1.png");
		
		int i = in.read();
		
		while ( i != -1) {
			
			out.write(i);
			
			i = in.read();
			
		}
		
		out.close();
		
		in.close();
		
		System.out.println("File is Successfully Copied...");
		
	}

}
