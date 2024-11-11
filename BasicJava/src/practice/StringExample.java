package practice;

public class StringExample {
	
	public static void main(String[] args) {
		
		String name = "Abeet Kumar Patel";
		
		System.out.println("String length = "+name.length());
		System.out.println("7th Character is = "+name.charAt(6));
		System.out.println("Kumar index is = "+name.indexOf("Kumar"));
		System.out.println("First e Position = "+name.indexOf('e'));
		System.out.println("Last e position = "+name.lastIndexOf('e'));
		System.out.println("e is replace by i = "+name.replace('e', 'i'));
		System.out.println("Lower case = "+name.toLowerCase());
		System.out.println("Upper case = "+name.toUpperCase());
		System.out.println("Starts With Abeet = "+name.startsWith("Abeet"));
		System.out.println("Ends with Kumar = "+name.endsWith("Kumar"));
		System.out.println("Substring = "+name.substring(6));
		
	}

}
