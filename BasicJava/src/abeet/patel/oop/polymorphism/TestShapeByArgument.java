package abeet.patel.oop.polymorphism;

public class TestShapeByArgument {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(5);
		s[1] = new Rectangle(4,5);
		s[2] = new Triangle(3,2);
		
		double totalArea = calcArea(s);
		
		System.out.println(totalArea);
		
	}
	
	public static double calcArea(Shape[]s) {
		
		double totalArea = 0;
		
		for (int i = 0; i < s.length; i++) {
			
			totalArea += s[i].area();
			
		}
		
		return totalArea;
		
	}
	
}
