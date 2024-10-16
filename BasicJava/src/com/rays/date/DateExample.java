package com.rays.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		Date d = new Date();

		System.out.println("simple date = " + d);

		System.out.println("formated date = " + sdf.format(d));

	}

}
