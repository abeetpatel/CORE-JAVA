package practiceOOP.polymorphism;

public class Triangle extends Shape {
	
	public int hight;
	
	public int base;
	
	public Triangle () {
		
	}
	
	public Triangle(int h, int b) {
		
		this.hight = h;
		
		this.base = b;
		
	}
	
	@Override
	public double area() {
	
		double area = (base * hight)/ 2;
		
		return area;
		
	}

}
