package practice;

public class ForEachLoop1 {
	
	public static void main(String[] args) {
		
		int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("{"+i[0]+" "+i[1]+" "+i[2]+" "+i[3]+" "+i[4]+" "+i[5]+" "+i[6]+" "+i[7]+" "+i[8]+"}");
		
		for( int a : i) {
			
			System.out.print(a);
			
		}
		
	}

}
