package abeet.patel.io;

import java.io.File;
import java.util.Date;

public class TestFile {
	
	public static void main(String[] args) {
		
		File f = new File("D:\\IO\\RAM.txt");
		
		System.out.println(f.exists());
		
	
	
	if (f.exists()) {
		
		System.out.println("file name = "+f.getName());
		System.out.println("get path = "+f.getAbsolutePath());
		System.out.println("can write = "+f.canWrite());
		System.out.println("can read = "+f.canRead());
		
		Date d = new Date( f.lastModified());
		System.out.println(d);
		
	}else {
		
		System.out.println("File is not exists..");
		
	}
		
	}

}
