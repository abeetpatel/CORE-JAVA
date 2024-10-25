package abeet.patel.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWritePrimitiveData {
	
	public static void main(String[] args)throws Exception {
		
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D://IO//PR.txt"));
		
		out.writeInt(5);
		out.writeBoolean(false);
		out.writeChar('a');
		out.writeDouble(10.5);
		
		out.close();
		
		System.out.println("data added....");
		
		DataInputStream in = new DataInputStream(new FileInputStream("D://IO//PR.txt"));
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		
		in.close();
		
	}

}
