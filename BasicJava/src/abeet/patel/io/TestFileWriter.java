package abeet.patel.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("D:\\IO\\rays.txt", true); 
		
		//if there is nothing means there is by default false.
		
		char[] ch = {'H','i'};
		
		fw.write(ch);
		
		fw.write(" , ");
		
		fw.write("Rays");
		
		System.out.println("data write successfully....");
		
		fw.close();
		
	}

}
