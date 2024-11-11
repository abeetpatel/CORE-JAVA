package practiceIO;

import java.io.FileReader;

public class TestFileReader  {
	
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("D://IO//practiceIO.txt");
		
		int i = fr.read();
		
		char ch;
		
		while ( i != -1) {
			
			ch = (char) i;
			
			System.out.print(ch);
			
			i = fr.read();
			
		}
		
		fr.close();
		
	}

}
