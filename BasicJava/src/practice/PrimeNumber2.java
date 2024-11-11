package practice;

import java.util.Scanner;

public class PrimeNumber2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number...");
		
		int num = sc.nextInt();
		
		int count = 0;
		
		for (int i = 2; i < num; i++) {
			
			if( num % i == 0) {
				
				count++;
				
			}
			
		}
		
		if (count == 0) {
			
			System.out.println("This is a Prime number...");
			
		}else {
			
			System.out.println("This is not a Prime number... ");
			
		}
		
	}

}
