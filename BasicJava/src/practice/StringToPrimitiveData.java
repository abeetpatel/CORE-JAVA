package practice;

public class StringToPrimitiveData {
	
	public static void main(String[] args) {
		
		String a = "5";
		
		String b = "5.5";
		
		String c = "true";
		
		String d = "5.2";
		
		//Parsing String into Primitive Data..
		
		int p = Integer.parseInt(a);
		
		double q = Double.parseDouble(b);
		
		boolean r = Boolean.parseBoolean(c);
		
		float s = Float.parseFloat(d);
		
		//Primitive Data to String...
		
		String e = String.valueOf(p);
		String f = String.valueOf(d);
		String g = String.valueOf(r);
		String h = String.valueOf(s);

	}

}
