package practiceOOP.polymorphism;

public class Rectangle extends Shape {
	
	public int length;
	
	public int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(int l, int w) {
		
		this.length = l;
		
		this.width = w;
		
	}
	
	@Override
	public double area() {
		
		double area = length * width;
		
		return area;
	}

}
