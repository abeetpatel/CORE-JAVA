package practiceExceptionHandling;

public class UncheckedException {
	
	public static void main(String[] args) {
		
		dad();
		
	}
	
	public static void son() {
		
		throw new RuntimeException("make mistake....");
		
	}
	
	public static void mom() {
		
		son();
		
	}
	
	public static void dad() {
		
		mom();
		
	}

}
