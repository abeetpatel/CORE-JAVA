package abeet.patel.javaoop;

public class TestAutoMobile {
	
	public static void main(String[] args) {
		
		AutoMobile a = new AutoMobile(); 
		
		a.setColor("red");
		a.setSpeed(60);
		a.setMake("TATA");
		
		System.out.println("Automobile's color = "+a.getColor());
		System.out.println("Automobile's speed = "+a.getSpeed());
		System.out.println("Automobile's maker = "+a.getMake());
		
	}

}
