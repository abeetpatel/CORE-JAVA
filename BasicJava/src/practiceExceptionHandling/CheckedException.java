package practiceExceptionHandling;

public class CheckedException {
	
	public static void main(String[] args) {
		
		dad();
		
	}
	
	public static void son() throws Exception{
		
		throw new Exception ("Make mistake..");
		
	}
	
	public static void mom() throws Exception {
		
		son();
		
	}
	
	public static void dad() {
		
		try {
			mom();
		} catch (Exception e) {
			System.out.println("Catch block...");
		}
		
		finally {
			
			System.out.println("This is Finally block...");
			
		}
		
	}

}
