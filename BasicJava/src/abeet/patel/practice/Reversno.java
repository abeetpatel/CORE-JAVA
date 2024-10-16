package abeet.patel.practice;

public class Reversno {
	
	public static void main(String[] args) {
		
		int num = 457;
		
		int rev = 0;
		
		int r = 0;
		
		int num2 = num;
			
			while(num2 != 0) {
				
				r = num2 % 10;
				
				rev = rev * 10 + r;
				
				num2 = num2 / 10;
				
			}
			
			System.out.println(" Reverse no. = "+rev);
		
	}

}
