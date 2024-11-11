package practiceOOP;

public class MethodOverLoading {
	
	public void add (int a, int b) {
		
		System.out.println("Sum of two int = "+(a+b));
		
	}
	
	public void add(double a, double b) {
		
		System.out.println("Sum of two double = "+(a+b));
		
	}
	
	public void add (int a, int b, int c) {
		
		System.out.println("Sum of three int = "+(a+b+c));
		
	}
	
	public static void main(String[] args) {
		
		MethodOverLoading m = new MethodOverLoading();
		
		m.add(4, 5);
		m.add(4, 5);
		m.add(4, 5, 0);
		
	}

}
