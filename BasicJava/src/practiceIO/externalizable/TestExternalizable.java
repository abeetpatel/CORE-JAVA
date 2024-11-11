package practiceIO.externalizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {
	
	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee("ram", 202);
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO//practicetest2.txt"));
		
		out.writeObject(e);
		
		System.out.println("Object Externalization successfull......");
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO//practicetest2.txt"));
		
		e = (Employee) in.readObject();
		
		System.out.println(e);
		
		in.close();
		
	}

}
