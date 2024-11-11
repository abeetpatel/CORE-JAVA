package com.rays.thread;

public class ByRunnable implements Runnable {

	public String name;

	public ByRunnable(String name) {

		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i + " = " + name);

		}

	}

}
