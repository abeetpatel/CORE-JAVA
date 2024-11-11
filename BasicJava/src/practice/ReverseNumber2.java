package practice;

import java.util.Scanner;

public class ReverseNumber2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your number...");
		
		int num = sc.nextInt();
		
		int r = 0;
		
		int rev = 0;
		
		while( num != 0) {
			
			r = num % 10;
			
			rev = rev*10 + r;
			
			num = num / 10;
 			
		}
		
		System.out.println("Reverse number = "+rev);
		
	}

}
