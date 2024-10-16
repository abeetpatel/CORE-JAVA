package abeet.patel.basic;

public class Reverseno {
	public static void main(String[] args) {
		
		int num = 457;
		int rev = 0;
		int num2 = num;
		int r = 0;
		
		while( num2 != 0) {
			
			r = num2 % 10;
			rev = rev *10 +r ;
			num2 = num2 / 10;
		}System.out.println( "Reverse no. = " +rev);
	}

}
