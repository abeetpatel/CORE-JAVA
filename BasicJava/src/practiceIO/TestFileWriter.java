package practiceIO;

import java.io.FileWriter;

public class TestFileWriter {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("D://IO//practice.txt");
		
		char[] ch = {'H','i'};
		
		fw.write(ch);
		
		fw.write(" , ");
		
		fw.write("Operator...");
		
		System.out.println("File is Successfully writen...");
		
		fw.close();
		
	}

}
