package practiceJava8;

import java.util.Arrays;

public class ShortingArray {
	
	public static void main(String[] args) {
		
		int[] a = { 1 , 5 , 3 , 6 , 8 , 2 , 4 ,7 , 9};
		
		Arrays.parallelSort(a);
		
		for( int b : a) {
			
			System.out.println(b);
			
		}
		
	}

}
