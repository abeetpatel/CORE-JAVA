package practice;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter month name..");
		
		String month = sc.next();
		
		switch (month) {
		
		case "jan":
			
			System.out.println("This is first month..");
			
			break;
			
		case "feb":
			
			System.out.println("This is second munth..");
			
			break;
			
		case "march":
			
			System.out.println("This is third month..");
			
			break;

		default:
			
			System.out.println("this is default..");
			
			break;
		}
		
	}

}
