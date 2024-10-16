package abeet.patel.basic;

public class Armstrongno {
	public static void main(String[] args) {
		
		int num = 153;
		int temp = 0;
		int r = 0;
		int num2 = num;
		
		while ( num2 != 0) {
			
			r = num2 % 10;
			temp = temp + r*r*r;
			num2 = num2 / 10;
			
		}
		if (temp == num) {
			System.out.println( " This no. is an armstrong no. ");
		}else {
			System.out.println( " This no. is not an armstrong no. ");
		}
	}

}
