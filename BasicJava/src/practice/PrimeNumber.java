package practice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int num = 125;
		
		int count = 0;
		
		for (int i = 2; i < 7; i++) {
			
			if( num % i == 0) {
				
				count++;
				
			}
			
		}if (count == 0) {
			
			System.out.println("This is a Prime number...");
			
		}else {
			
			System.out.println("This is not a Prime number... ");
			
		}
		
	}

}
