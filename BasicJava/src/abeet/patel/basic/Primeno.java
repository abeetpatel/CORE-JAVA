package abeet.patel.basic;

public class Primeno {
	
	public static void main(String[] args) {
		
		int num = 7;
		
		int count = 0;
		
		for( int i = 2; i < num; i++) {
			
			if ( num % i == 0) {
				
				count++;
				
			}
			
		}if( count == 0) {
			
			System.out.println(" Prime no.");
			
		}else {
			
			System.out.println( "Not a prime no.");
			
		}
		
	}

}
