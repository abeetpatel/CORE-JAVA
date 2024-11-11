package practiceIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream in = new FileInputStream("D://IO//rays.png");
		
		FileOutputStream out = new FileOutputStream("D://IO//rays2.png");
		
		int i = in.read();
		
		while( i != -1) {
			
			out.write(i);
			
			i = in.read();
			
		}
		
		System.out.println("copied....");
		
		in.close();
		
		out.close();
		
	}

}
