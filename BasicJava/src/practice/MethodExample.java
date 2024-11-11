package practice;

public class MethodExample {
	
	public void add(int a, int b ) {
		
		System.out.println("Sumition of two number = "+( a + b));
		
	}
	
	public void substrac(int a, int b) {
		
		System.out.println("Substraction of two numbers = "+( a - b));
		
	}
	
	public void multiply(int a, int b) {
		
		System.out.println("Multiplication of two numbers = "+( a * b));
		
	}
	
	public void divide(int a, int b) {
		
		System.out.println("Dividation of two numbers = "+( a / b));
		
	}
	
	public static void main(String[] args) {
		
		MethodExample m = new MethodExample();
		
		m.add(5, 4);
		
		m.substrac(9, 4);
		
		m.multiply(4, 5);
		
		m.divide(20, 5);
		
	}

}
