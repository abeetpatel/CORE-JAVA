package practiceOOP;

public class Circle extends Shape{

	public int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		
		double area = Math.PI * ( radius * radius);
		
		return area;
	}
	
}
