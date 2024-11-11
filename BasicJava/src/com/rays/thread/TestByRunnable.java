package com.rays.thread;

public class TestByRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRunnable("ram"));
		Thread t2 = new Thread(new ByRunnable("shyam"));

		t1.start();
		t2.start();

	}

}
