package abeet.patel.practice;

public class MethodExample {
	
     public void add (int a , int b) {
    	 
    	 System.out.println("sum of two no. = "+(a+b));
    	 
     }
     
     public void substract( int a , int b) {
    	 
    	 System.out.println("substraction of two no. = "+(a - b));
    	 
     }
     
     public void multiply( int a , int b) {
    	 
    	 System.out.println("multiply of two no. = "+(a * b));
    	 
     }
     
     public void divide( int a , int b) {
    	 
    	 System.out.println("divition of two no. = "+( a/ b));
    	 
     }
     
     public static void main(String[] args) {
		
    	 MethodExample m = new MethodExample();
    	 
    	 m.add(4, 5);
    	 m.substract(7, 5);
    	 m.multiply(4, 5);
    	 m.divide(81, 9);
    	 
	}

}
