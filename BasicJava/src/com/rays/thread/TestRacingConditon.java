package com.rays.thread;

public class TestRacingConditon {

	public static void main(String[] args) {

		TestAccount t1 = new TestAccount("Shyam");
		TestAccount t2 = new TestAccount("Ram");

		t1.start();
		t2.start();

	}

}
