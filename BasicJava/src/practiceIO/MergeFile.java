package practiceIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MergeFile {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("D://IO//P1.txt");
		
		BufferedReader br = new BufferedReader( new FileReader("D://IO//A1.txt"));
		
		String s1 = br.readLine();
		
		while( s1 != null) {
			
			fw.write(s1+" \n");
			
			s1 = br.readLine();
			
		}
		
		br.close();
		
		br = new BufferedReader(new FileReader("D://IO//A2.txt"));
		
		String s2 = br.readLine();
		
		while ( s2 != null) {
			
			fw.write(s2);
			
			s2 = br.readLine();
			
		}
		
		System.out.println("File marged Successfully ..");
		
		br.close();
		
		fw.close();
		
	}

}
