package practice;

import java.util.Scanner;

public class PelindromNumber1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number...");
		
		int num = sc.nextInt();
		
		int r = 0;
		
		int temp = 0;
		
		int num2 = num;
		
		while( num2 != 0) {
			
			 r = num2 % 10;
			
			 temp = temp*10 + r;
			
			 num2 = num2 / 10 ;
			
		}if ( num == temp) {
			
			System.out.println("This is a Fabonacci number...");
			
		}else{
			
			System.out.println("This is not a Fabonacci number...");
			
		}
		
	}

}
