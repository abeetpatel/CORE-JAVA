package com.rays.javaoop;

public class Automobile {

	public String color;
	public int speed;
	public String make;

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getColor() {
		return this.color;
	}

	public int getSpeed() {
		return this.speed;
	}

	public String getmake() {
		return this.make;
	}

	public void changeGear(int speed) {

		if (speed > 20 && speed < 50) {

			System.out.println("your speed is > 20 pleas switch the geare 2nd");

		}
		if (speed > 50 && speed < 80) {

			System.out.println("your speed is > 50 pleas switch the geare 3rd");

		}
		if (speed > 80 && speed < 120) {

			System.out.println("your speed is > 80 pleas switch the geare 4th");

		}
		if (speed > 120) {

			System.out.println("your speed is > 120 pleas switch the geare 5th");

		}

	}

	public void carBreak(int speed) {

		if (speed == 0) {
			System.out.println("break lag gayaaa.....");
		}

	}

}
