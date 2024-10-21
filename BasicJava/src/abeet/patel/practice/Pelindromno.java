package abeet.patel.practice;

public class Pelindromno {
	
    public static void main(String[] args) {
		
    	int num = 121;
    	
    	int temp = 0;
    	
    	int r = 0;
    	
    	int num2 = num;
    	
    	while( num2 != 0) {
    		
    		r = num2 % 10;
    		
    		temp = temp* 10 + r ;
    		
    		num2 = num2 / 10;
    		
    	}
    	
    	if ( temp == num) {
    		
    		System.out.println("this is a pelindrom no...");
    		
    	}else {
    		
    		System.out.println("this is not a pelindrom no...");
    		
    	}
    	
	}

}
