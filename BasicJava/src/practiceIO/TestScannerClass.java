package practiceIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter integer input...");
		
		try{
			
			int i = sc.nextInt();
		
		double a = sc.nextDouble();
		
		System.out.println("int = "+i);
		
		System.out.println("double = "+a);
		
		}catch(InputMismatchException e) {
			
			System.out.println("format not match...");
			
		}
		
		sc.close();
		
	}	

}
