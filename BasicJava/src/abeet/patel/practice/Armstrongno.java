package abeet.patel.practice;

public class Armstrongno {
	
	public static void main(String[] args) {
		
		int num = 153;
		
		int temp = 0;
		
		int num2 = num;
		
		int r = 0;
		
		while( num2 != 0) {
			
			r = num2 % 10;
			
			temp = temp + r* r*r;
			
			num2 = num2 / 10;
			
			
		}
		
		if (temp == num) {
			
			System.out.println(" this is an amstrong no.");
			
		}
		
		else {
			
			System.out.println(" this is not an armstrong no.");
			
		}
		
	}

}
