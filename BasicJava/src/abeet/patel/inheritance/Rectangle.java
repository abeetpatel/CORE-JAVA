package abeet.patel.inheritance;

public class Rectangle {
	
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}

}