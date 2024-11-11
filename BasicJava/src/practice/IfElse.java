package practice;

public class IfElse {
	
	public static void main(String[] args) {
		
		 java.util.Scanner sc = new java.util.Scanner(System.in);
		 
		 System.out.println("enter the amount..");
		
		int amount = sc.nextInt();
		
		if (amount > 100) {
			
			System.out.println("I can't buy this thing..");
			
		}else {
			
			System.out.println("I can buy this thing..");
			
		}
		
	}

}
