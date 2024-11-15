package abeet.patel.java8;

public class AnonymousFunction {
	
	public static void main(String[] args) {
		
		FuntionalInt f = new FuntionalInt() {
			
			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return a+ b;
			}
		};
		
		int a = 5 ;
		int b = 40;
		
		System.out.println(f.sum(a, b));
		
	}

}
