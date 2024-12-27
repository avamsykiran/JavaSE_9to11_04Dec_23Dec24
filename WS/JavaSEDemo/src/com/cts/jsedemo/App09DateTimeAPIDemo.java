package com.cts.jsedemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App09DateTimeAPIDemo {

	public static void main(String[] args) {
		
		LocalTime start = LocalTime.now();
		
		final String DT_PATTERN = "dd-MMM-yyyy";

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DT_PATTERN);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.format(dtf));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Date of Birth ("+ DT_PATTERN +"): ");
		String dobStr = scan.next();
		
		LocalDate dob = LocalDate.parse(dobStr, dtf);
		Period age = Period.between(dob, today);
		System.out.println(String.format("You are exactly %d yrs %d months and %d days of age ", age.getYears(),age.getMonths(),age.getDays()));
		
		final int maxService = 60;
		LocalDate retrirementDate = dob.plusYears(maxService);
		System.out.println("After 60 hyears of your age, you may retire by "+retrirementDate.format(dtf));
		
		LocalTime end = LocalTime.now();
		Duration executionTime = Duration.between(start, end);
		
		System.out.println("Exectuion Time of this app is: "+executionTime.toMillis() + " milli seconds");
		
		scan.close();
	}

}
