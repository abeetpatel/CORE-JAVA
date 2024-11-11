package practiceOOP.dataAbstract;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle() {
			
	}
	
	public Circle(int r) {
		
		this.radius = r;
		
	}

	@Override
	public double area() {
		
		double area = Math.PI*(radius * radius);
		
		return area;
	}
	
	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		
		System.out.println(c.area());
		
	}

}
