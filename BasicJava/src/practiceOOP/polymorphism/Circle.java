package practiceOOP.polymorphism;

public class Circle extends Shape{
	
	public int radius;
	
	public Circle() {
		
	}
	
	public Circle(int r) {
		
		this.radius = r;
		
	}

	@Override
	public double area() {
		
		double area = Math.PI * radius * radius;
		
		return area;
	}

}
