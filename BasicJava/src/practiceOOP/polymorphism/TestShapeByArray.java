package practiceOOP.polymorphism;

public class TestShapeByArray {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[3];
		
		s[0] = new Circle(5);
		s[1] = new Rectangle(4, 5);
		s[2] = new Triangle(4, 5);
		
		System.out.println(s[0].area());
		System.out.println(s[1].area());
		System.out.println(s[2].area());
		System.out.println("Total Area = "+(s[0].area()+s[1].area()+s[2].area()));
		
	}

}
