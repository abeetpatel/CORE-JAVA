package practiceJava8;

public class LemdaExpression {
	
	public static void main(String[] args) {
		
		FunctionalInt f = (a , b ) -> {
			
			return ( a + b);
			
		};
		
		int a = 5;
		
		int b = 10;
		
		System.out.println(f.sum(a, b));
		
	}

}
