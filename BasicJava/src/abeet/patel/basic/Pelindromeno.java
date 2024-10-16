package abeet.patel.basic;

public class Pelindromeno {
	public static void main(String[] args) {
		
	
	 
	int num = 121;
	int rev = 0;
	int r = 0;
	int num2 = num;
	
	while( num != 0) {
		
		r = num % 10;
		rev = rev * 10 + r;
		num = num / 10;
		
	}
	if ( rev == num2) {
		System.out.println( " This no. is pelindrome no,");
		
		
	}else {
		System.out.println( "this no. is not pelindrome no.");
	}
	
	}


}