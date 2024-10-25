package abeet.patel.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a integer value : ");
		
		try{
			int i = sc.nextInt();
		
		double a = sc.nextDouble();
		
		System.out.println("int = "+i);
		
		System.out.println("double = "+a);
		
	}catch(InputMismatchException e) {
		
		System.out.println("Number format Exception...");
		
	}
		sc.close();

}
}