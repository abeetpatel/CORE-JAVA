package practice;

import java.util.Scanner;

public class ArmstrongNumber2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number...");
		
		int num = sc.nextInt();
		
		int r = 0;
		
		int temp = 0;
		
		int num2 = num;
		
		while( num2 != 0) {
			
			r = num2 % 10;
			
			temp = temp + r*r*r;
			
			num2 = num2 / 10;
			
		}if( temp == num) {
			
			System.out.println("This is an Armstrong Number...");
			
		}else {
			
			System.out.println("This is not an Armstrong Number...");
			
		}
		
		
		
	}

}
