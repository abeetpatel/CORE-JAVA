package abeet.patel.java8;

import java.util.Arrays;

public class ShortingArray {
	
	public static void main(String[] args) {
		
		int[] a = {1 , 5 , 8, 4, 2, 9, 7 ,10, 6};
		
		Arrays.parallelSort(a);
		
		for( int b : a) {
			
			System.out.println(b);
			
		}
		
	}

}
