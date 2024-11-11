package practice;

public class Factorial2 {
	
	public static void main(String[] args) {
		
		int num = 7;
		
		int fact = 1;
		
		for (int i = num; i > 0; i--) {
			
			fact = fact * i;
			
		}
		
		System.out.println("Factorial = "+fact);
		
	}

}
