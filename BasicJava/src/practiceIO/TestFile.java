package practiceIO;

import java.io.File;
import java.util.Date;

public class TestFile {
	
	public static void main(String[] args) {
		
	File f = new File("D://IO//practiceIO.txt");
	
	System.out.println(f.exists());
	
	if(f.exists()) {
		
		System.out.println("File name = "+f.getName());
		System.out.println("File path = "+f.getPath());
		System.out.println("Can read = "+f.canRead());
		System.out.println("Can write = "+f.canWrite());
		
		Date d = new Date(f.lastModified());
		System.out.println("Last modified = "+d);
		
	}else {
		
		System.out.println("File is not available..");
		
	}
		
	}

}
