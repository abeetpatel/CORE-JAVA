package com.rays.javaoop;

public class TestAutomobile {

	public static void main(String[] args) {

		Automobile a1 = new Automobile();

		a1.setColor("Red");
		a1.setSpeed(21);
		a1.setMake("TATA");

		System.out.println("Color = " + a1.getColor());
		System.out.println("Top Speed = " + a1.getSpeed() + "km/h");
		System.out.println("Maker = " + a1.getmake());

		int speed = a1.getSpeed();

		a1.changeGear(speed);

		a1.setSpeed(0);

		a1.carBreak(a1.getSpeed());

	}
}