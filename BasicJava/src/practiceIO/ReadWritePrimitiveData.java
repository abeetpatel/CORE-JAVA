package practiceIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWritePrimitiveData {
	
	public static void main(String[] args) throws Exception {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://IO//PrimitiveData.txt"));
		
		out.write(5);
		out.writeBoolean(false);
		out.writeChar('a');
		out.writeDouble(5.6);
		
		out.close();
		
		System.out.println("done...");
		
		DataInputStream in = new DataInputStream(new FileInputStream("D://IO//PrimitiveData.txt"));
		
		System.out.println(in.read());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
		in.close();
		
	}

}
