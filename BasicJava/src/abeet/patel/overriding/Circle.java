package abeet.patel.overriding;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int r) {
		this.radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
        
		double area = Math.PI * radius *radius;
		
		return area;
	}

}
