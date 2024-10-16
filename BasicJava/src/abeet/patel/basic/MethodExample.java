package abeet.patel.basic;

public class MethodExample {
	
	public void add( int a,int b) {
		System.out.println("Sum of two no. = " +(a+b));
	}
	public void substract( int a,int b) {
		System.out.println("Substraction of two no. = " +(a-b));
	}
	public static void main(String[] args) {
		 
		MethodExample c = new MethodExample();
		
		c.add(4, 8);
		c.substract(9, 4);
		
		
		
	}

}
