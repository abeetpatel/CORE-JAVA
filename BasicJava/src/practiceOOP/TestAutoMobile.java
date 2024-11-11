package practiceOOP;

public class TestAutoMobile {
	
	public static void main(String[] args) {
		
		Automobile a = new Automobile();
		
		a.setColor("Black");
		a.setMake("Ford");
		a.setSpeed(60);
		
		System.out.println("Car color = "+a.getColor());
		System.out.println("Car made by = "+a.getMake());
		System.out.println("Car's Current Speed = "+a.getSpeed()+"Km/s");
		
	}

}
