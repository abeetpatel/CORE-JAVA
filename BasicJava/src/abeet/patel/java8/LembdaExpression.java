package abeet.patel.java8;

public class LembdaExpression {
	
	public static void main(String[] args) {
		
		FuntionalInt f = (a, b) -> {
		
			return(a + b);
			
		};
		
		int a = 8;
		
		int b = 25;
		
		System.out.println(f.sum(a, b));
		
	}

}
