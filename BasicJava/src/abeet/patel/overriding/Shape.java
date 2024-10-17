package abeet.patel.overriding;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getcolor() {
		return this.color;
	}
	
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public int getBorderWidth() {
		 return this.borderWidth;
	}
	
	public double area() {
		return 0.0;
	}

}
